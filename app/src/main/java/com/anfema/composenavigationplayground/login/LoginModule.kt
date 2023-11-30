package com.anfema.composenavigationplayground.login

import com.anfema.composenavigationplayground.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val loginModule = module {
    viewModel { LoginViewModel(get()) }
}
