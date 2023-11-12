package com.example.quiz.data

import com.example.quiz.R

/*
* Quiz UI State
* Contains data that has to be passed through different screens
* */
data class QuizUiState (
    val question: Question = Question(
        R.string.question,
        listOf(R.string.option1, R.string.option2, R.string.option3, R.string.option4),
        R.string.option3
    ),
    val score: Int = 0,
)
