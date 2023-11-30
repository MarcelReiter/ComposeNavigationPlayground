package com.anfema.composenavigationplayground.login

import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.compose.composable
import androidx.navigation.createGraph

private const val LOGIN_GRAPH = "loginGraph"
private const val LOGIN_SCREEN = "loginScreen"

fun NavController.createLoginGraph(): NavGraph =
    createGraph(
        route = LOGIN_GRAPH,
        startDestination = LOGIN_SCREEN,
        builder = {
            composable(LOGIN_SCREEN) {
                LoginScreen()
            }
        }
    )
