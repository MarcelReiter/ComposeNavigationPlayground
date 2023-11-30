package com.anfema.composenavigationplayground.red

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.anfema.composenavigationplayground.blue.BLUE_GRAPH

const val RED_GRAPH = "redGraph"
private const val RED_SCREEN = "redScreen"

fun NavController.navigateToRedNavGraph(){
    navigate(RED_GRAPH)
}

fun NavGraphBuilder.redNavGraph() {
    navigation(
        route = RED_GRAPH,
        startDestination = RED_SCREEN,
    ){
        composable(RED_SCREEN) {
            RedScreen()
        }
    }
}