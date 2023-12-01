package com.anfema.composenavigationplayground.login.main

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.PurpleColorScheme
import org.koin.androidx.compose.getViewModel

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = getViewModel()
) {
    ColorTheme(PurpleColorScheme) {
        LoginScreen(
            onLogin = viewModel::login
        )
    }
}

@Composable
private fun LoginScreen(
    onLogin: () -> Unit,
) {
    DefaultScreen(
        name = "Login",
        actions = {},
        content = {
            Button(
                onClick = onLogin,
                text = "Login",
            )
        }
    )
}
