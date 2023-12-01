package com.anfema.composenavigationplayground.green.main

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.GreenColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun GreenScreen(
    viewModel: GreenViewModel = getViewModel()
) {
    ColorTheme(GreenColorScheme) {
        GreenScreen(
            onLogout = viewModel::logout
        )
    }
}

@Composable
private fun GreenScreen(
    onLogout: () -> Unit,
) {
    DefaultScreen(
        name = "Green",
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
