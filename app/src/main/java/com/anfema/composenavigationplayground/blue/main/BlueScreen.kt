package com.anfema.composenavigationplayground.blue.main

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import com.anfema.composenavigationplayground.ui.theme.BlueColorScheme
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import org.koin.androidx.compose.getViewModel

@Composable
fun BlueScreen(
    onOpenDetail: () -> Unit,
    viewModel: BlueViewModel = getViewModel(),
) {
    ColorTheme(BlueColorScheme) {
        BlueScreen(
            onLogout = viewModel::logout,
            onOpenDetail = onOpenDetail,
        )
    }
}

@Composable
private fun BlueScreen(
    onLogout: () -> Unit,
    onOpenDetail: () -> Unit,
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
            Button(
                text = "Open Detail Screen",
                onClick = onOpenDetail,
            )
        }
    )
}
