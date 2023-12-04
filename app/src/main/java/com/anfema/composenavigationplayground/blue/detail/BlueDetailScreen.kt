package com.anfema.composenavigationplayground.blue.detail

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DetailScreen
import com.anfema.composenavigationplayground.ui.theme.BlueColorScheme
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import org.koin.androidx.compose.getViewModel

@Composable
fun BlueDetailScreen(
    onNavigateBack: () -> Unit,
    viewModel: BlueDetailViewModel = getViewModel(),
) {
    ColorTheme(BlueColorScheme) {
        BlueDetailScreen(
            onLogout = viewModel::logout,
            onNavigateBack = onNavigateBack,
        )
    }
}

@Composable
private fun BlueDetailScreen(
    onLogout: () -> Unit,
    onNavigateBack: () -> Unit,
) {
    DetailScreen(
        name = "Blue",
        onNavigateBack = onNavigateBack,
        actions = {
            Button(
                text = "Logout",
                onClick = onLogout,
            )
        },
        content = {

        }
    )
}
