package com.example.artviewer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artviewer.ui.theme.ArtViewerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtViewerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtDisplay()
                }
            }
        }
    }
}

@Composable
fun ArtDisplay() {
    data class Art(val imageSource: Int, val imageName: String, val artist: String)
    val arts : ArrayList<Art> = arrayListOf()
    arts.add(Art(
        R.drawable.mona_lisa,
        "Mona Lisa",
        "Leonardo da Vinci"
    ))
    arts.add(Art(
        R.drawable.starry_night,
        "Starry Night",
        "Vincent van Gogh"
    ))
    arts.add(Art(
        R.drawable.the_kiss,
        "The Kiss",
        "Gustav Klimt"
    ))
    arts.add(Art(
        R.drawable.garden_of_earthly_delights,
        "Garden of Earthly Delights",
        "Hieronymus Bosch"
    ))
    arts.add(Art(
        R.drawable.girl_with_the_pearl_earring,
        "The Girl with the Pearl Earring",
        "Johannes Vermeer"
    ))
    var i by remember { mutableStateOf(0) }
    val n= arts.size
    Row (
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(arts[i].imageSource),
                contentDescription = arts[i].imageName,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = arts[i].imageName,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = arts[i].artist)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = { i+=n-1; i%=n }) {
                    Text(text = "Previous")
                }
                Button(onClick = { i++; i%=n }) {
                    Text(text = "Next")
                }
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
    ArtViewerTheme {
        ArtDisplay()
    }
}