package com.example.quiz.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.quiz.data.QuizUiState
import com.example.quiz.data.questions
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class QuizViewModel: ViewModel() {
    // ViewModel holds event handlers, responsible for data modification
    private val _quizUiState = MutableStateFlow(QuizUiState())
    val quizUiState: StateFlow<QuizUiState> = _quizUiState.asStateFlow()
    var currentQuestion: Int = 0
    private var updatedScore: Int = quizUiState.value.score
    private val tag = "ViewModel"

    // Initialize the UI State on activity start
    init {
        reset()
    }


    fun nextQuestion(selectedOption: Int) {
        if(selectedOption==quizUiState.value.question.answer)
            updatedScore = quizUiState.value.score.inc()

        if(currentQuestion != questions.lastIndex) {
            currentQuestion = currentQuestion.inc()
            _quizUiState.update { currentState ->
                currentState.copy(
                    score = updatedScore,
                    question = questions[currentQuestion]
                )
            }
        } else if(currentQuestion == questions.lastIndex) {
            _quizUiState.update {currentState ->
                currentState.copy (
                    score = updatedScore
                )
            }
        }
        Log.d(tag, "Score is ${_quizUiState.value.score}")
    }

    fun reset() {
        currentQuestion = 0
        _quizUiState.value = QuizUiState(questions[currentQuestion])
    }
}