package com.anfema.composenavigationplayground.green

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val greenModule = module {
    viewModel { GreenViewModel(get()) }
}
