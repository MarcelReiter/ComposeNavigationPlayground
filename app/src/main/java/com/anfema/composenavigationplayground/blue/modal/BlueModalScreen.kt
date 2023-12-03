package com.anfema.composenavigationplayground.blue.modal

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.ModalScreen
import com.anfema.composenavigationplayground.ui.theme.BlueColorScheme
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import org.koin.androidx.compose.getViewModel

@Composable
fun BlueModalScreen(
    viewModel: BlueModalViewModel = getViewModel()
) {
    ColorTheme(BlueColorScheme) {
        BlueModalScreen(
            onLogout = viewModel::logout
        )
    }
}

@Composable
private fun BlueModalScreen(
    onLogout: () -> Unit,
) {
    ModalScreen(
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
