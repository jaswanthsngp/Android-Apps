package com.example.quiz.data

import androidx.annotation.StringRes

data class Question(
    @StringRes
    val question: Int,
    @StringRes
    val options: List<Int>,
    @StringRes
    val answer: Int
)
