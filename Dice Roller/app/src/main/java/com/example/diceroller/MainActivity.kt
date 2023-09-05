package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diceroller.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DiceRoller()
                }
            }
        }
    }
}

@Composable
fun DiceRoller() {
    DiceWithButtonAndImage()
}

@Composable
fun DiceWithButtonAndImage(
    modifier : Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(align = Alignment.Center)) {
    var num by remember { mutableStateOf(1) }
    var diceImage = when (num) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        6 -> R.drawable.dice_6
        else -> R.drawable.ic_launcher_foreground
    }
    Column (
        modifier= modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image (
            painter= painterResource(id= diceImage),
            contentDescription = num.toString()
        )
        Spacer(modifier= Modifier.height(16.dp))
        Button(
            onClick= { num= (1..6).random() }
        ) {
            Text (
                text = stringResource(R.string.roll)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DiceRollerPreview() {
    DiceRollerTheme {
        DiceRoller()
    }
}