package com.anfema.composenavigationplayground.green

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.anfema.composenavigationplayground.blue.BLUE_GRAPH

const val GREEN_GRAPH = "greenGraph"
private const val GREEN_SCREEN = "greenScreen"

fun NavGraphBuilder.greenNavGraph() {
    navigation(
        route = GREEN_GRAPH,
        startDestination = GREEN_SCREEN,
    ) {
        composable(GREEN_SCREEN) {
            GreenScreen()
        }
    }
}
