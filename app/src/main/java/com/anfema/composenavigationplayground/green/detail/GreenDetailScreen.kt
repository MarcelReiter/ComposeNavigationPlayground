package com.anfema.composenavigationplayground.green.detail

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DetailScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.GreenColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun GreenDetailScreen(
    onNavigateBack: () -> Unit,
    viewModel: GreenDetailViewModel = getViewModel(),
) {
    ColorTheme(GreenColorScheme) {
        GreenDetailScreen(
            onLogout = viewModel::logout,
            onNavigateBack = onNavigateBack,
        )
    }
}

@Composable
private fun GreenDetailScreen(
    onLogout: () -> Unit,
    onNavigateBack: () -> Unit,
) {
    DetailScreen(
        name = "Green",
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
