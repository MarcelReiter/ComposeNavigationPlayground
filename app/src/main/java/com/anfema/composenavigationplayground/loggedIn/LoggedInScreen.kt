package com.anfema.composenavigationplayground.loggedIn

import androidx.compose.runtime.Composable
import com.anfema.composenavigationplayground.ui.composables.Button
import com.anfema.composenavigationplayground.ui.composables.DefaultScreen
import org.koin.androidx.compose.getViewModel

@Composable
fun LoggedInScreen(
    viewModel: LoggedInViewModel = getViewModel()
) {
    LoggedInScreen(
        onLogin = viewModel::logout
    )
}

@Composable
private fun LoggedInScreen(
    onLogin: () -> Unit,
) {
    DefaultScreen(
        name = "LoggedIn",
        actions = {
            Button(
                onClick = onLogin,
                text = "Logout",
            )
        },
        content = {

        }
    )
}
