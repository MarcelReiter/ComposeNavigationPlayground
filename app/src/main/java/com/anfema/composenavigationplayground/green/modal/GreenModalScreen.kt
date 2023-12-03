package com.anfema.composenavigationplayground.green.modal

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.ModalScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.GreenColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun GreenModalScreen(
    viewModel: GreenModalViewModel = getViewModel()
) {
    ColorTheme(GreenColorScheme) {
        GreenModalScreen(
            onLogout = viewModel::logout
        )
    }
}

@Composable
private fun GreenModalScreen(
    onLogout: () -> Unit,
) {
    ModalScreen(
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
