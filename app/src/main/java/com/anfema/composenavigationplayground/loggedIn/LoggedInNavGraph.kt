package com.anfema.composenavigationplayground.loggedIn

import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.compose.composable
import androidx.navigation.createGraph

private const val LOGGED_IN_GRAPH = "loggedInGraph"
private const val LOGGED_IN_SCREEN = "loggedInScreen"

fun NavController.createLoggedInNavGraph(): NavGraph =
    createGraph(
        route = LOGGED_IN_GRAPH,
        startDestination = LOGGED_IN_SCREEN,
        builder = {
            composable(LOGGED_IN_SCREEN) {
                LoggedInScreen()
            }
        }
    )
