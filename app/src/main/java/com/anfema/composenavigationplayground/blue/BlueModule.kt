package com.anfema.composenavigationplayground.blue

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val blueModule = module {
    viewModel { BlueViewModel(get()) }
}
