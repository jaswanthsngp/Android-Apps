package com.example.coursetopicsgrid

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResource: Int,
    val hits: Int,
    @DrawableRes val imageResource: Int,
)
