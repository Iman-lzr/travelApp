package com.example.travelappfigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelappfigma.ui.theme.TravelAppFigmaTheme

class FavoritesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppFigmaTheme {
                FavoritesScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoritesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(color = colorResource(id = R.color.gris)),
        verticalArrangement = Arrangement.Top
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Best Offers",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable { /* click */ }
            ) {
                Text(
                    text = "See All",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.purple_500),
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    painter = painterResource(id = R.drawable.baseline_keyboard_arrow_right_24),
                    contentDescription = null,
                    tint = colorResource(id = R.color.purple_500)
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        horizontalCard()
        Spacer(modifier = Modifier.height(16.dp))
        WinterJourney()
        popularLocation()
        Acheivement()
    }
}

@Composable
fun horizontalCard() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()

            .horizontalScroll(rememberScrollState())
    ) {
        Card(
            onClick = { /* clic */ },
            colors = CardDefaults.cardColors(Color.White),
            modifier = Modifier
                .width(250.dp)
                .height(160.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cqrd1),
                    contentDescription = "Card Image",
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                )
                Text(
                    text = "Cupid's Gift for Couples",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp)
                )
              Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(30.dp)){

                  Text(
                      text = " Up to 30% OFF",
                      fontSize = 17.sp,
                      fontWeight = FontWeight.Bold,
                      modifier = Modifier.padding(top = 3.dp)
                  )
                  Text(
                      text = " View details",
                      fontSize = 12.sp,
                      fontWeight = FontWeight.Normal, color = colorResource(id = R.color.purple_500),
                      modifier = Modifier.padding(top = 3.dp)
                  )
              }
            }
        }
        Card(
            onClick = { /* clic */ },
            colors = CardDefaults.cardColors(Color.White),
            modifier = Modifier
                .width(250.dp)
                .height(160.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cqrd1),
                    contentDescription = "Card Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "Title for Card 2",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp)
                )
                Text(
                    text = "Jaisi ZT",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 3.dp)
                )
            }
        }
    }
}

@Composable
fun WinterJourney(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Winter Journey",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { /* click */ }
        ) {
            Text(
                text = "See All",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.purple_500),
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                painter = painterResource(id = R.drawable.baseline_keyboard_arrow_right_24),
                contentDescription = null,
                tint = colorResource(id = R.color.purple_500)
            )
        }
    }
    Row ( verticalAlignment = Alignment.CenterVertically,modifier = Modifier
        .fillMaxWidth()
        .horizontalScroll(rememberScrollState())){
       Box(modifier = Modifier
           .width(200.dp)
           .height(130.dp)){
           Image(painter = painterResource(id = R.drawable.card3), contentDescription = "",
               modifier = Modifier.fillMaxSize())
       }
        Box(modifier = Modifier
            .width(200.dp)
            .height(130.dp)){
           Image(painter = painterResource(id = R.drawable.card4), contentDescription = "",
               modifier = Modifier.fillMaxSize())
       }
    }
}

@Composable
fun popularLocation(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Popular Location",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { /* click */ }
        ) {
            Text(
                text = "See All",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.purple_500),
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                painter = painterResource(id = R.drawable.baseline_keyboard_arrow_right_24),
                contentDescription = null,
                tint = colorResource(id = R.color.purple_500)
            )
        }
    }
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()

            .horizontalScroll(rememberScrollState())
    ) {
        Card(
            onClick = { /* clic */ },
            colors = CardDefaults.cardColors(Color.White),
            modifier = Modifier
                .width(250.dp)
                .height(160.dp)
        ) {
            Column(
                modifier = Modifier
                    .width(250.dp)
                    .padding(8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.card6),
                    contentDescription = "Card Image",
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                )
                Text(
                    text = "Eifiel Towr",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp)
                )
                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(30.dp)){

                    Text(
                        text = " Paris Eyfel Kulesi",
                        fontSize = 14.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(top = 3.dp)
                    )
                    Text(
                        text = " 2450 KMS",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.purple_500),
                        modifier = Modifier.padding(top = 3.dp)
                    )
                }
            }
        }
        Card(
            onClick = { /* clic */ },
            colors = CardDefaults.cardColors(Color.White),
            modifier = Modifier
                .width(250.dp)
                .height(160.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.card7),
                    contentDescription = "Card Image",
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                )
                Text(
                    text = "Beautiful China",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp)
                )
                Text(
                    text = "Shanghai, China",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 3.dp)
                )
            }
        }
    }
}
@Composable
fun Acheivement(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Acheivement",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { /* click */ }
        ) {
            Text(
                text = "See All",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = colorResource(id = R.color.purple_500),
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                painter = painterResource(id = R.drawable.baseline_keyboard_arrow_right_24),
                contentDescription = null,
                tint = colorResource(id = R.color.purple_500)
            )
        }
    }
    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.purple_500))
        ,modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.li_gift), contentDescription = "",
                modifier = Modifier.size(20.dp)
            )

        Spacer(modifier = Modifier.padding(horizontal = 5.dp))
        Text(text = "1/10 Journey", color = Color.White)


    }
}
