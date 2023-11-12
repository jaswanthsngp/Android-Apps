@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.quiz

import android.util.Log
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.quiz.data.questions
import com.example.quiz.ui.QuestionScreen
import com.example.quiz.ui.QuizViewModel
import com.example.quiz.ui.ScoreScreen
import com.example.quiz.ui.WelcomeScreen

val tag = "Navigator"
enum class QuizScreen(@StringRes val title:Int) {
    WELCOME(R.string.app_name),
    QUESTION(R.string.question),
    RESULT(R.string.result)
}

@Composable
fun QuizAppBar(
    currentScreen: QuizScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth().background(Color.Cyan)
) {
    TopAppBar(
        title = { Text(text = stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if(canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(id = R.string.back_button)
                    )
                }
            }
        }
    )
    Log.d(tag, "Top App Bar Called")
}

@Composable
fun QuizApp(
    viewModel: QuizViewModel = viewModel(),
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier.fillMaxSize()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = QuizScreen.valueOf(
        backStackEntry?.destination?.route ?:QuizScreen.WELCOME.name
    )
    Log.d(tag, "Quiz App Called")
    Scaffold (
        topBar = {
            QuizAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerpadding ->
        val uiState by viewModel.quizUiState.collectAsState()

        NavHost (
            navController = navController,
            startDestination = QuizScreen.WELCOME.name,
            modifier = Modifier.fillMaxSize().padding(innerpadding)
        ) {
            composable(route = QuizScreen.WELCOME.name) {
                Log.d(tag, "Welcome Screen Called")
                WelcomeScreen(
                    onNextButtonClicked = { navController.navigate(QuizScreen.QUESTION.name) }
                )
            }
            composable(route = QuizScreen.QUESTION.name) {
                Log.d(tag, "Question Screen Called")
                QuestionScreen(
                    currentQuestion = uiState.question,
                    nextQuestion = { viewModel.nextQuestion(it) },
                    onFinish = { navController.navigate(QuizScreen.RESULT.name) },
                    onRestart = {
                        viewModel.reset()
                        navController.popBackStack(QuizScreen.WELCOME.name, false)
                    },
                    isLast = viewModel.currentQuestion == questions.lastIndex
                )
            }
            composable(route = QuizScreen.RESULT.name) {
                Log.d(tag, "Result Screen Called")
                ScoreScreen(
                    score = uiState.score,
                    maxScore = questions.size,
                    goHome = {
                        viewModel.reset()
                        navController.popBackStack(QuizScreen.WELCOME.name, false)
                    }
                )
            }
        }
    }
}
