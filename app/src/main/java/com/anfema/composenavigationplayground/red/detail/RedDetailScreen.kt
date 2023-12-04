package com.anfema.composenavigationplayground.red.detail

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DetailScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.RedColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun RedDetailScreen(
    onNavigateBack: () -> Unit,
    viewModel: RedDetailViewModel = getViewModel(),
) {
    ColorTheme(RedColorScheme) {
        RedDetailScreen(
            onLogout = viewModel::logout,
            onNavigateBack = onNavigateBack,
        )
    }
}

@Composable
private fun RedDetailScreen(
    onLogout: () -> Unit,
    onNavigateBack: () -> Unit,
) {
    DetailScreen(
        name = "Red",
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
