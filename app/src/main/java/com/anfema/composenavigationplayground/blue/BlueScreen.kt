package com.anfema.composenavigationplayground.blue

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import org.koin.androidx.compose.getViewModel

@Composable
fun BlueScreen(
    viewModel: BlueViewModel = getViewModel()
) {
    BlueScreen(
        onLogout = viewModel::logout
    )
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
