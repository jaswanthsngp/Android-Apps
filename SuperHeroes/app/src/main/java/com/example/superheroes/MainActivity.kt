@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.example.superheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.DeviceFontFamilyName
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroes.ui.theme.SuperHeroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperHeroesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HeroList(Modifier.padding(8.dp, 0.dp))
                }
            }
        }
    }
}

@Composable
fun HeroList(modifier : Modifier = Modifier) {
    Scaffold (
        topBar = {
            HeroTopBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(Heroes) {
                HeroItem(
                    heroCard = it,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun HeroTopBar() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.displayLarge
        )
    }
}

@Composable
fun HeroItem(heroCard : Hero, modifier : Modifier = Modifier) {
    Card (
        modifier = modifier
    ) {
        Row (
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth(0.7f)
            ) {
                Text(
                    text = stringResource(id = heroCard.name),
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = stringResource(id = heroCard.info),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Image(
                painter = painterResource(id = heroCard.pic),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.clip(RoundedCornerShape(8.dp))
            )
        }
    }
}


@Preview (
    showSystemUi = true,
    showBackground = true
)
@Composable
fun SuperHeroesLight() {
    SuperHeroesTheme (darkTheme = false) {
        HeroList()
    }
}

@Preview (
    showSystemUi = true,
    showBackground = true
)
@Composable
fun SuperHeroesDark() {
    SuperHeroesTheme (darkTheme = true) {
        HeroList()
    }
}