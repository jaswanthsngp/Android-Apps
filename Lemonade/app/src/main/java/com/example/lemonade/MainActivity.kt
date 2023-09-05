package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeApp()
                }
            }
        }
    }
}

@Composable
fun LemonadeApp() {
    var clicks= 10
    var image by remember { mutableStateOf(R.drawable.lemon_tree) }
    var caption= remember { R.string.pluck }
    var handler= when (image) {
        R.drawable.lemon_tree -> fun () {
            image= R.drawable.lemon_squeeze
            caption= R.string.squeeze
            clicks= (1..10).random()
        }
        R.drawable.lemon_squeeze -> fun() {
            clicks--
            image= if (clicks==0) R.drawable.lemon_drink else R.drawable.lemon_squeeze
            caption= if (clicks==0) R.string.drink else R.string.squeeze
        }
        R.drawable.lemon_drink -> fun () {
            image= R.drawable.lemon_restart
            caption= R.string.restart
        }
        else -> fun () {
            image= R.drawable.lemon_tree
            caption= R.string.pluck
        }
    }
    Column(
        modifier= Modifier
            .fillMaxSize()
            .wrapContentSize(align = Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick= handler,
            shape = RoundedCornerShape(20),
            colors = ButtonDefaults.buttonColors(Color(105,205,216, 127))
        ) {
            Image(
                painter= painterResource(id = image),
                contentDescription = null
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text= stringResource(caption), fontSize = 18.sp)
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
        LemonadeApp()
    }
}