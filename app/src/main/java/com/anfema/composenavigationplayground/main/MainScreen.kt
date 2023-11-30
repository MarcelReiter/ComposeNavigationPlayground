package com.anfema.composenavigationplayground.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import org.koin.androidx.compose.getViewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel = getViewModel()
) {
    MainScreen(
        isLoggedIn = viewModel.isLoggedIn.collectAsState().value,
    )
}

@Composable
fun MainScreen(
    isLoggedIn: Boolean,
) {
    DefaultScreen(
        name = "Main",
        actions = {}
    ) {
        Text(text = "IsLoggedIn = $isLoggedIn")
    }
}
