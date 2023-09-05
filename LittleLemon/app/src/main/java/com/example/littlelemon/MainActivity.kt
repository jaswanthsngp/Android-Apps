package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // you have created a fn that displays everything, call it here
                    Greeting("Himanshi", Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // add the image through view > tool windows > resource manager > Add(+) > Import resources
    val image= painterResource(id = R.drawable.androidparty)
    // and the address is R.drawable.imageName
    Image(
        // Image fn to display image, painter holds the image
        painter = image,
        contentDescription = null
    )
    Column(
        // put the text elements in a row or column so that they don't overlap
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        // Text element, holds the text and its styling
        Text(
            text = "Hello $name!",
            modifier = modifier,
            fontSize = 60.sp,
            lineHeight = 72.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Text(
            text = "I am a Android Develper",
            fontSize = 24.sp,
            lineHeight = 45.sp,
            color = Color.Red,
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Preview(
    // this tells how the preview is shown
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    // what to preview
    LittleLemonTheme {
        Greeting("Himanshi")
    }
}