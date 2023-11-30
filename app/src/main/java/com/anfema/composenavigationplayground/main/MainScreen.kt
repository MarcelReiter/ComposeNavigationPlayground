package com.anfema.composenavigationplayground.main

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.anfema.composenavigationplayground.loggedIn.createLoggedInNavGraph
import com.anfema.composenavigationplayground.login.createLoginGraph
import com.anfema.composenavigationplayground.navigation.navigateToBottomBarDestination
import com.anfema.composenavigationplayground.ui.composables.BottomBar
import com.anfema.composenavigationplayground.ui.composables.BottomBarItem.BlueBottomBarItem
import com.anfema.composenavigationplayground.ui.composables.BottomBarItem.GreenBottomBarItem
import com.anfema.composenavigationplayground.ui.composables.BottomBarItem.RedBottomBarItem
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

    Column {
        NavHost(
            navController = navController,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            graph = remember(isLoggedIn) {
                if (isLoggedIn) {
                    navController.createLoggedInNavGraph()
                } else {
                    navController.createLoginGraph()
                }
            }
        )

        if (isLoggedIn) {
            // see https://developer.android.com/jetpack/compose/navigation#bottom-nav
            BottomBar(
                items = listOf(BlueBottomBarItem, RedBottomBarItem, GreenBottomBarItem),
                isSelected = { item -> backStackEntry?.destination?.hierarchy?.any { it.route == item.route } == true },
                onClick = { navController.navigateToBottomBarDestination(it.route) }
            )
        }
    }

    LaunchedEffect(backStackEntry) {
        Log.d("Navigation", "Backstack update: ${navController.currentBackStack.value.map { it.destination.route }}")
    }
}
