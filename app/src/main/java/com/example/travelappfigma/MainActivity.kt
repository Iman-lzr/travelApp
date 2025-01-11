package com.example.travelappfigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelappfigma.ui.theme.TravelAppFigmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppFigmaTheme {
                AppBar()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("")
                },
                navigationIcon = {
                    IconButton(onClick = { /* Action pour le menu */ }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu",
                            tint = Color.Blue)
                    }
                },
                actions = {

                    IconButton(onClick = { /* Action pour l'image de profil */ }) {
                        Image(
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = "Image Profil",
                            modifier = Modifier.size(70.dp)
                        )
                    }
                }
            )
        },
        content = { paddingValues ->
            Text(
                text = "Contenu principal",
                modifier = Modifier
                    .padding(paddingValues)
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TravelAppFigmaTheme {
        AppBar()
    }
}
