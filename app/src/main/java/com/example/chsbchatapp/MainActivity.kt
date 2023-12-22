package com.example.chsbchatapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.chsbchatapp.navigation.NavGraph
import com.example.chsbchatapp.ui.theme.Primary
import com.example.chsbchatapp.ui.theme.ChatApp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatApp {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Primary
                ) {
                    NavGraph()
                }
            }
        }
    }
}


