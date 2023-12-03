package com.anfema.composenavigationplayground.red.modal

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.ModalScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.RedColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun RedModalScreen(
    viewModel: RedModalViewModel = getViewModel()
) {
    ColorTheme(RedColorScheme) {
        RedModalScreen(
            onLogout = viewModel::logout
        )
    }
}

@Composable
private fun RedModalScreen(
    onLogout: () -> Unit,
) {
    ModalScreen(
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
