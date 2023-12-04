package com.anfema.composenavigationplayground.red.main

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.RedColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun RedScreen(
    onOpenDetail: () -> Unit,
    viewModel: RedViewModel = getViewModel(),
) {
    ColorTheme(RedColorScheme) {
        RedScreen(
            onLogout = viewModel::logout,
            onOpenDetail = onOpenDetail,
        )
    }
}

@Composable
private fun RedScreen(
    onLogout: () -> Unit,
    onOpenDetail: () -> Unit,
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
            Button(
                text = "Open Detail Screen",
                onClick = onOpenDetail,
            )
        }
    )
}
