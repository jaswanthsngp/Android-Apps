package com.example.quiz.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz.R
import com.example.quiz.data.Question
import com.example.quiz.data.QuizUiState

@Composable
fun QuestionScreen(
    currentQuestion: Question,
    nextQuestion: (Int) -> Unit,
    onFinish: () -> Unit,
    onRestart: () -> Unit,
    isLast: Boolean,
    modifier: Modifier = Modifier.fillMaxSize()
) {
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(currentQuestion.options[0]) }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(6.dp, 12.dp)
    ) {
        Text(
            text = stringResource(currentQuestion.question),
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Left
        )
        currentQuestion.options.forEach { option ->
            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .selectable(
                        selected = (selectedOption == option),
                        onClick = { onOptionSelected(option) },
                        role = Role.RadioButton
                    )
            ) {
                RadioButton(selected = option==selectedOption, onClick = null)
                Text(
                    text = stringResource(id = option),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(4.dp, 0.dp)
                )
            }
        }
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 0.dp)
        ) {
            Button(onClick = onRestart) {
                Text(text = "Restart")
            }
            Button(
                onClick = {
                    nextQuestion(selectedOption)
                    if(isLast) {
                        onFinish()
                    }
                }
            ) {
                Text(
                    text = if(isLast) "Finish" else "Next"
                )
            }
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun questionScreenPreview() {
    QuestionScreen(
        currentQuestion = Question(
            R.string.question,
            listOf(R.string.option1, R.string.option2, R.string.option3, R.string.option4),
            R.string.option3
        ),
        nextQuestion = { /*TODO*/ },
        onFinish = { /*TODO*/ },
        onRestart = { /*TODO*/ },
        isLast = false
    )
}
