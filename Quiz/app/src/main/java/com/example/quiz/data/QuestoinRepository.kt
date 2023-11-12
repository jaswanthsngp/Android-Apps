package com.example.quiz.data

import com.example.quiz.R

/* Data Repository
*  The values in this class are never modified by any UI component,
*  but are only read.
*/

val questions = listOf(
    Question(
        R.string.question,
        listOf(R.string.option1, R.string.option2, R.string.option3, R.string.option4),
        R.string.option3
    ),
    Question(
        R.string.question,
        listOf(R.string.option1, R.string.option2, R.string.option3, R.string.option4),
        R.string.option3
    ),
    Question(
        R.string.question,
        listOf(R.string.option1, R.string.option2, R.string.option3, R.string.option4),
        R.string.option2
    ),
    Question(
        R.string.question,
        listOf(R.string.option1, R.string.option2, R.string.option3, R.string.option4),
        R.string.option4
    ),
    Question(
        R.string.question,
        listOf(R.string.option1, R.string.option2),
        R.string.option1
    ),
)
