package com.anfema.composenavigationplayground.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

// see https://developer.android.com/jetpack/compose/navigation#bottom-nav
fun NavController.navigateToBottomBarDestination(
    destination: String,
) {
    navigate(destination) {
        popUpTo(graph.findStartDestination().id) {
            inclusive = false
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}
