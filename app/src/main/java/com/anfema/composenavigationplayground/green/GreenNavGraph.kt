package com.anfema.composenavigationplayground.green

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.anfema.composenavigationplayground.green.main.GreenScreen

const val GREEN_GRAPH = "greenGraph"
private const val GREEN_SCREEN = "greenScreen"

fun NavGraphBuilder.greenNavGraph(navController: NavController) {
    navigation(
        route = GREEN_GRAPH,
        startDestination = GREEN_SCREEN,
    ) {
        composable(GREEN_SCREEN) {
            GreenScreen()
        }
    }
}
