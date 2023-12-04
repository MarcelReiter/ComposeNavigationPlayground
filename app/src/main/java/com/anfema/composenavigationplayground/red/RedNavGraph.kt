package com.anfema.composenavigationplayground.red

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.anfema.composenavigationplayground.red.detail.RedDetailScreen
import com.anfema.composenavigationplayground.red.main.RedScreen
import com.anfema.composenavigationplayground.red.modal.RedModalScreen
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet

const val RED_GRAPH = "redGraph"
private const val RED_SCREEN = "redScreen"
private const val RED_DETAIL_SCREEN = "redDetailScreen"
private const val RED_MODAL_SCREEN = "redModalScreen"

@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.redNavGraph(navController: NavController) {
    navigation(
        route = RED_GRAPH,
        startDestination = RED_SCREEN,
    ) {
        composable(RED_SCREEN) {
            RedScreen(
                onOpenDetail = { navController.navigate(RED_DETAIL_SCREEN) },
            )
        }

        composable(RED_DETAIL_SCREEN) {
            RedDetailScreen(
                onNavigateBack = navController::popBackStack,
            )
        }

        bottomSheet(RED_MODAL_SCREEN) {
            RedModalScreen()
        }
    }
}
