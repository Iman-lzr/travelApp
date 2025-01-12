package com.example.travelappfigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class BookingActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookingsScreen()
        }
    }
}

@Composable
fun BookingsScreen() {
    Text(
        text = "Bookings Screen",
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center
    )
}