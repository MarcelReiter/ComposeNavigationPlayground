package com.anfema.composenavigationplayground.green.main

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.GreenColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun GreenScreen(
    onOpenDetail: () -> Unit,
    onOpenModal: () -> Unit,
    viewModel: GreenViewModel = getViewModel(),
) {
    ColorTheme(GreenColorScheme) {
        GreenScreen(
            onLogout = viewModel::logout,
            onOpenDetail = onOpenDetail,
            onOpenModal = onOpenModal,
        )
    }
}

@Composable
private fun GreenScreen(
    onLogout: () -> Unit,
    onOpenDetail: () -> Unit,
    onOpenModal: () -> Unit,
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
            Button(
                text = "Open Detail Screen",
                onClick = onOpenDetail,
            )
            Button(
                text = "Open Modal",
                onClick = onOpenModal,
            )
        }
    )
}
