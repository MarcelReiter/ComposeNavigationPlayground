package com.anfema.composenavigationplayground.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.anfema.composenavigationplayground.ui.theme.ComposeNavigationPlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationPlaygroundTheme {
                MainScreen()
            }
        }
    }
}
