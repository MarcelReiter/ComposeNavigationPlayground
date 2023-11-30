package com.anfema.composenavigationplayground.red

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val redModule = module {
    viewModel { RedViewModel(get()) }
}
