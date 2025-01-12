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

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
        }
    }
}
@Composable
fun ProfileScreen() {
    Text(
        text = "Profile Screen",
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center
    )
}