package com.anfema.composenavigationplayground.blue

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.anfema.composenavigationplayground.blue.detail.BlueDetailScreen
import com.anfema.composenavigationplayground.blue.main.BlueScreen
import com.anfema.composenavigationplayground.blue.modal.BlueModalScreen
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet

const val BLUE_GRAPH = "blueGraph"
private const val BLUE_SCREEN = "blueScreen"
private const val BLUE_DETAIL_SCREEN = "blueDetailScreen"
private const val BLUE_MODAL_SCREEN = "blueModalScreen"

@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.blueNavGraph(navController: NavController) {
    navigation(
        route = BLUE_GRAPH,
        startDestination = BLUE_SCREEN,
    ) {
        composable(BLUE_SCREEN) {
            BlueScreen(
                onOpenDetail = { navController.navigate(BLUE_DETAIL_SCREEN) }
            )
        }

        composable(BLUE_DETAIL_SCREEN) {
            BlueDetailScreen(
                onNavigateBack = navController::popBackStack,
            )
        }

        bottomSheet(BLUE_MODAL_SCREEN) {
            BlueModalScreen()
        }
    }
}
