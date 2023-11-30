package com.anfema.composenavigationplayground.red

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.RedColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun RedScreen(
    viewModel: RedViewModel = getViewModel()
) {
    ColorTheme(RedColorScheme) {
        RedScreen(
            onLogout = viewModel::logout
        )
    }
}

@Composable
private fun RedScreen(
    onLogout: () -> Unit,
) {
    DefaultScreen(
        name = "Red",
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
