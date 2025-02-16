package com.example.travelappfigma

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
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
    var selectedTab by remember { mutableStateOf(0) }

    Scaffold(
        topBar = { AppBar() },
        bottomBar = { BottomBar(selectedTab = selectedTab, onTabSelected = { selectedTab = it }) },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .background(color = colorResource(id = R.color.gris))
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp)
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                when (selectedTab) {
                    0 -> HomeScreen()
                    1 -> FavoritesScreen()
                    2 -> BookingsScreen()
                    3 -> ProfileScreen()
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colorResource(id = R.color.gris)
        ),
        title = { Text("") },
        navigationIcon = {
            IconButton(onClick = { /* Action pour le menu */ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = colorResource(id = R.color.purple_500)
                )
            }
        },
        actions = {
            IconButton(onClick = { /* Action pour l'image de profil */ }) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "Image Profil",
                    modifier = Modifier.size(56.dp)
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
            fontSize = 18.sp
        )
        Text(
            text = "Make plan for Weekend",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            modifier = Modifier.padding(top = 4.dp, start = 8.dp)
        )
    }
}

@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf(TextFieldValue("")) }

    Row(verticalAlignment = Alignment.CenterVertically) {
        OutlinedTextField(
            value = searchText,
            shape = RoundedCornerShape(8.dp),
            onValueChange = { searchText = it },
            modifier = Modifier
                .weight(1f)
                .background(Color.White)
                .height(50.dp),
            placeholder = {
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier.padding(start = 4.dp)
                ) {
                    Text(
                        text = "Search places ..",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
            }

        )
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.group8),
                contentDescription = "",
                modifier = Modifier.size(48.dp)
            )
        }
    }
}

@Composable
fun ScrollHorizontal() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .padding(start = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(60.dp)) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img1),
                    contentDescription = "Image",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(60.dp)) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img2),
                    contentDescription = "Image",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(60.dp)) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img3),
                    contentDescription = "Image",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(60.dp)) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img4),
                    contentDescription = "Image",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(60.dp)) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.img5),
                    contentDescription = "Image",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
fun BookFlight() {
    var departureText by remember { mutableStateOf(TextFieldValue("")) }
    var arrivalText by remember { mutableStateOf(TextFieldValue("")) }
    var departureDateText by remember { mutableStateOf(TextFieldValue("")) }

    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Book Your Flight",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            FlightSelectionBar()
            Spacer(modifier = Modifier.padding(top = 10.dp))

            Text("From", fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 4.dp))
            OutlinedTextField(
                value = departureText,
                shape = RoundedCornerShape(8.dp),

                onValueChange = { departureText = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(color = colorResource(id = R.color.gris))
                    .padding(vertical = 8.dp),
                placeholder = { Text("Choose Departure from", fontSize = 14.sp) }

            )

            Spacer(modifier = Modifier.height(16.dp))

            Text("To", fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 4.dp))
            OutlinedTextField(
                value = arrivalText,
                shape = RoundedCornerShape(8.dp),
                onValueChange = { arrivalText = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(color = colorResource(id = R.color.gris))
                    .padding(vertical = 8.dp),
                placeholder = { Text("Choose Arrival at", fontSize = 14.sp) }
            )


            Divider(modifier = Modifier.padding(bottom = 10.dp, top = 10.dp))

            Text(
                "Departure Date",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 4.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = departureDateText,
                    shape = RoundedCornerShape(8.dp),
                    onValueChange = { departureDateText = it },
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp)
                        .background(color = colorResource(id = R.color.gris))
                        .padding(vertical = 8.dp),

                    placeholder = { Text("Choose your date", fontSize = 14.sp) }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Image(
                    painter = painterResource(id = R.drawable.icon2),
                    contentDescription = "Date Picker",
                    modifier = Modifier.size(48.dp)
                )
            }
            Divider(modifier = Modifier.padding(bottom = 10.dp, top = 10.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                // Adult Adult
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Text(text = "Adult 12+", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.width(100.dp)
                    ) {
                        Button(
                            onClick = { /*TODO: Decrease Adult Count */ },
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(30.dp),
                            contentPadding = PaddingValues(0.dp),
                            elevation = ButtonDefaults.buttonElevation(7.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                        ) {
                            Text(text = "-", color = Color.Black, fontWeight = FontWeight.Bold,fontSize = 14.sp)
                        }

                        Text(
                            text = "00",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Button(
                            onClick = { /*TODO: Increase Adult Count */ },
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(30.dp),
                            contentPadding = PaddingValues(0.dp),
                            elevation = ButtonDefaults.buttonElevation(7.dp),
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.purple_500) )
                        ) {
                            Text(text = "+", color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    }
                }

                // Child column
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Text(text = "Child 2-12", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.width(100.dp)
                    ) {
                        Button(
                            onClick = { /*TODO: Decrease Child Count */ },
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(30.dp),
                            contentPadding = PaddingValues(0.dp),
                            elevation = ButtonDefaults.buttonElevation(7.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                        ) {
                            Text(text = "-", color = Color.Black, fontWeight = FontWeight.Bold)
                        }

                        Text(
                            text = "00",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Button(
                            onClick = { /*TODO: Increase Child Count */ },
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(30.dp),
                            contentPadding = PaddingValues(0.dp),
                            elevation = ButtonDefaults.buttonElevation(7.dp),
                            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.purple_500))
                        ) {
                            Text(text = "+", color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.width(300.dp),
                contentPadding = PaddingValues(0.dp),
                border = BorderStroke(2.dp, colorResource(id = R.color.purple_500)),
                elevation = ButtonDefaults.buttonElevation(7.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white))
            ) {
                Text(
                    text = "SEARCH FLIGHT",
                    color = colorResource(id = R.color.purple_500),
                    fontWeight = FontWeight.Bold
                )
            }

        }}}

@Composable
fun FlightSelectionBar() {
    var selectedOption by remember { mutableStateOf("One Way") }
    val options = listOf("One Way", "Round Trip", "Multicity")

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(40.dp)
            .background(
                color = Color.Gray.copy(alpha = 0.2f),
                shape = RoundedCornerShape(20.dp)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        options.forEachIndexed { index, option ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        color = if (selectedOption == option) colorResource(id = R.color.purple_500) else Color.Transparent,
                        shape = when (index) {
                            0 -> RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp)
                            options.size - 1 -> RoundedCornerShape(
                                topEnd = 20.dp,
                                bottomEnd = 20.dp
                            )

                            else -> RoundedCornerShape(0.dp)
                        }
                    )
                    .clickable { selectedOption = option },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = option,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (selectedOption == option) Color.White else Color.Gray
                )
            }
        }
    }
}
@Composable
fun BottomBar(selectedTab: Int, onTabSelected: (Int) -> Unit) {
    NavigationBar(
        containerColor = Color.White
    ) {
        NavigationBarItem(
            selected = selectedTab == 0,
            onClick = { onTabSelected(0) },
            icon = {
                Image(
                    painter = painterResource(id = R.drawable.fram1),
                    contentDescription = "icon 1",
                    modifier = Modifier.size(35.dp)
                )
            }
        )
        NavigationBarItem(
            selected = selectedTab == 1,
            onClick = { onTabSelected(1) },
            icon = {
                Image(
                    painter = painterResource(id = R.drawable.fram2),
                    contentDescription = "icon 2",
                    modifier = Modifier.size(25.dp)
                )
            }
        )
        NavigationBarItem(
            selected = selectedTab == 2,
            onClick = { onTabSelected(2) },
            icon = {
                Image(
                    painter = painterResource(id = R.drawable.fram3),
                    contentDescription = "icon 3",
                    modifier = Modifier.size(25.dp)
                )
            }
        )
        NavigationBarItem(
            selected = selectedTab == 3,
            onClick = { onTabSelected(3) },
            icon = {
                Image(
                    painter = painterResource(id = R.drawable.fram4),
                    contentDescription = "icon 4",
                    modifier = Modifier.size(25.dp)
                )
            }
        )
    }
}


@Composable
fun HomeScreen() {
    Salutation()
    Spacer(modifier = Modifier.height(24.dp))
    SearchBar()
    Spacer(modifier = Modifier.height(16.dp))
    ScrollHorizontal()
    Spacer(modifier = Modifier.height(16.dp))
    BookFlight()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TravelAppFigmaTheme {
        MainScreen()
    }
}