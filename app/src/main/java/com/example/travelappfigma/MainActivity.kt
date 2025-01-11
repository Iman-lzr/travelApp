package com.example.travelappfigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelappfigma.ui.theme.TravelAppFigmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppFigmaTheme {
                MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen() {
    Scaffold(
        topBar = { AppBar() },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = 16.dp)
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                Salutation()
                Spacer(modifier = Modifier.height(24.dp))

                SearchBar()
                Spacer(modifier = Modifier.height(16.dp))

                ScrollHorizontal()
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    TopAppBar(
        title = { Text("") },
        navigationIcon = {
            IconButton(onClick = { /* Action pour le menu */ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = Color.Blue
                )
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
}

@Composable
fun Salutation() {
    Column {
        Text(
            text = "Good Morning, Shreya ...",
            modifier = Modifier.padding(start = 8.dp),
            fontSize = 16.sp
        )
        Text(
            text = "Make plan for Weekend",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 4.dp, start = 8.dp)
        )
    }
}

@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf(TextFieldValue("")) }

    Row {
        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            modifier = Modifier
                .weight(1f)
                .height(50.dp),
            placeholder = { Text("Search places ..", fontSize = 14.sp, textAlign = TextAlign.Start) },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Icône de recherche")
            }
        )

        Spacer(modifier = Modifier.height(8.dp))
       IconButton(onClick = { /*TODO*/ }) {
          Image(painter = painterResource(id = R.drawable.group8),
              contentDescription = "", modifier = Modifier.size(48.dp))
           
       }
    }
}
@Composable
fun ScrollHorizontal() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .padding(start = 8.dp)
    ) {
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(80.dp)) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img1),
                    contentDescription = "img 1",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(80.dp)) {
            // Image 2
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img2),
                    contentDescription = "img 2",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(80.dp)) {
            // Image 3
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img3),
                    contentDescription = "img 3",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(80.dp)) {
            // Image 4
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img4),
                    contentDescription = "img 4",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }


    IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(80.dp)) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.img5),
            contentDescription = "img 5",
            modifier = Modifier.fillMaxSize()
        )
    }
   } }
}

@Composable
fun BookFlight(){

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TravelAppFigmaTheme {
        MainScreen()
    }
}
