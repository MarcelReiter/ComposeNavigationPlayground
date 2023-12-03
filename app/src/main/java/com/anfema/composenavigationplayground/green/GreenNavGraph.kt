package com.anfema.composenavigationplayground.green

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.anfema.composenavigationplayground.green.detail.GreenDetailScreen
import com.anfema.composenavigationplayground.green.main.GreenScreen
import com.anfema.composenavigationplayground.green.modal.GreenModalScreen
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet

const val GREEN_GRAPH = "greenGraph"
private const val GREEN_SCREEN = "greenScreen"
private const val GREEN_DETAIL_SCREEN = "greenDetailScreen"
private const val GREEN_MODAL_SCREEN = "greenModalScreen"

@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.greenNavGraph(navController: NavController) {
    navigation(
        route = GREEN_GRAPH,
        startDestination = GREEN_SCREEN,
    ) {
        composable(GREEN_SCREEN) {
            GreenScreen(
                onOpenDetail = { navController.navigate(GREEN_DETAIL_SCREEN) },
                onOpenModal = { navController.navigate(GREEN_MODAL_SCREEN) }
            )
        }

        composable(GREEN_DETAIL_SCREEN) {
            GreenDetailScreen(
                onNavigateBack = navController::popBackStack,
            )
        }

        bottomSheet(GREEN_MODAL_SCREEN) {
            GreenModalScreen()
        }
    }
}
