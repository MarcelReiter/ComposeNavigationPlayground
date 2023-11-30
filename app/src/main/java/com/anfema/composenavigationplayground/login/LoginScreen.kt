package com.anfema.composenavigationplayground.login

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import org.koin.androidx.compose.getViewModel

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = getViewModel()
) {
    LoginScreen(
        onLogin = viewModel::login
    )
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
