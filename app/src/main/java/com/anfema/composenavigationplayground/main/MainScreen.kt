package com.anfema.composenavigationplayground.main

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
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
    val navController = rememberNavController()
    val backStackEntry = navController.currentBackStackEntryAsState().value

    NavHost(
        navController = navController,
        modifier = Modifier.fillMaxSize(),
        graph = TODO()
    )

    LaunchedEffect(backStackEntry) {
        Log.d("Navigation", "Backstack update: ${navController.currentBackStack.value.map { it.destination.route }}")
    }
}
