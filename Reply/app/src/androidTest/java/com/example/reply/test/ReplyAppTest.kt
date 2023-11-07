package com.example.reply.test

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import com.example.reply.ui.ReplyApp
import org.junit.Rule
import org.junit.Test

class ReplyAppTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    @TestCompactWidth
    fun compactDevice_verifyBottomNavigation() {
        // Set up compact view
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Compact
            )
        }
        // Bottom Navigation is displayed
        composeTestRule.onNodeWithTagForStringId(
            com.example.reply.R.string.navigation_bottom
        ).assertExists()
    }

    @Test
    @TestMediumWidth
    fun mediumDevice_verifyNavigationRail() {
        // Set up compact view
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Medium
            )
        }
        // Bottom Navigation is displayed
        composeTestRule.onNodeWithTagForStringId(
            com.example.reply.R.string.navigation_rail
        ).assertExists()
    }

    @Test
    @TestExpandedWidth
    fun expandedDevice_verifyNavigationDrawer() {
        // Set up compact view
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Expanded
            )
        }
        // Bottom Navigation is displayed
        composeTestRule.onNodeWithTagForStringId(
            com.example.reply.R.string.navigation_drawer
        ).assertExists()
    }
}