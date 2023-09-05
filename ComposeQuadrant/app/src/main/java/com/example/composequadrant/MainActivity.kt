package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Row(
            modifier= modifier
                .weight(0.5f)
        ) {
            Column (
                modifier = modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.text_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text= stringResource(R.string.text_description),
                    textAlign = TextAlign.Justify,
                    modifier = modifier.padding(16.dp)
                )
            }
            Column (
                modifier = modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.image_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text= stringResource(R.string.image_description),
                    textAlign = TextAlign.Justify,
                    modifier = modifier.padding(16.dp)
                )
            }
        }
        Row (
            modifier = modifier
                .weight(0.5f)
        ) {
            Column (
                modifier = modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.row_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text= stringResource(R.string.row_description),
                    textAlign = TextAlign.Justify,
                    modifier = modifier.padding(16.dp)
                )
            }
            Column (
                modifier = modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.column_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text= stringResource(R.string.column_description),
                    textAlign = TextAlign.Justify,
                    modifier = modifier.padding(16.dp)
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Greeting("Android")
    }
}