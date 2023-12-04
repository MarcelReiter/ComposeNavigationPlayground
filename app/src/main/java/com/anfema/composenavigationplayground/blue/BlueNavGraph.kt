package com.anfema.composenavigationplayground.blue

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.anfema.composenavigationplayground.blue.main.BlueScreen

const val BLUE_GRAPH = "blueGraph"
private const val BLUE_SCREEN = "blueScreen"

fun NavGraphBuilder.blueNavGraph(navController: NavController) {
    navigation(
        route = BLUE_GRAPH,
        startDestination = BLUE_SCREEN,
    ) {
        composable(BLUE_SCREEN) {
            BlueScreen()
        }
    }
}
