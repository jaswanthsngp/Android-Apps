package com.example.coursetopicsgrid

import DataSource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursetopicsgrid.ui.theme.CourseTopicsGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseTopicsGridTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Grid()
                }
            }
        }
    }
}

@Composable
fun Grid() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        content = {
            items(DataSource.topics) { topic ->
                GridItem(topic)
            }
        },
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalArrangement = Arrangement.SpaceEvenly
    )
}


@Composable
fun GridItem(item: Topic) {
    Card (
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .padding(4.dp)
    ) {
        Row {
            Image(
                modifier = Modifier
                    .height(68.dp)
                    .width(68.dp)
                    .clip(RoundedCornerShape(16.dp, 0.dp, 0.dp, 16.dp)),
                painter = painterResource(id = item.imageResource),
                contentDescription = stringResource(id = item.stringResource),
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 0.dp)
            ) {
                Text(
                    text = stringResource(id = item.stringResource)
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(2.dp, 0.dp),
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = "grain icon",
                        colorFilter = ColorFilter.tint(color = Color.Black)
                    )
                    Text(text = item.hits.toString())
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
fun GridPreview() {
    Grid()
}