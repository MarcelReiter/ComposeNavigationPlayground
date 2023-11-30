package com.anfema.composenavigationplayground.blue

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import com.anfema.composenavigationplayground.ui.theme.BlueColorScheme
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import org.koin.androidx.compose.getViewModel

@Composable
fun BlueScreen(
    viewModel: BlueViewModel = getViewModel()
) {
    ColorTheme(BlueColorScheme) {
        BlueScreen(
            onLogout = viewModel::logout
        )
    }
}

@Composable
private fun BlueScreen(
    onLogout: () -> Unit,
) {
    DefaultScreen(
        name = "Blue",
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
