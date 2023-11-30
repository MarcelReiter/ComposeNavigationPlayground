package com.anfema.composenavigationplayground.loggedIn

import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.createGraph

private const val LOGGED_IN_GRAPH = "loggedInGraph"

fun NavController.createLoggedInNavGraph(): NavGraph =
    createGraph(
        route = LOGGED_IN_GRAPH,
        startDestination = TODO(),
        builder = {

        }
    )
