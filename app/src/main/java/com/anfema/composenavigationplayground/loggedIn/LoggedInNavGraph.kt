package com.anfema.composenavigationplayground.loggedIn

import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.createGraph
import com.anfema.composenavigationplayground.blue.BLUE_GRAPH
import com.anfema.composenavigationplayground.blue.blueNavGraph
import com.anfema.composenavigationplayground.green.greenNavGraph
import com.anfema.composenavigationplayground.red.redNavGraph

private const val LOGGED_IN_GRAPH = "loggedInGraph"

fun NavController.createLoggedInNavGraph(): NavGraph =
    createGraph(
        route = LOGGED_IN_GRAPH,
        startDestination = BLUE_GRAPH,
        builder = {
            blueNavGraph()
            greenNavGraph()
            redNavGraph()
        }
    )
