package com.anfema.composenavigationplayground.loggedIn

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val loggedInModule = module {
    viewModel { LoggedInViewModel(get()) }
}
