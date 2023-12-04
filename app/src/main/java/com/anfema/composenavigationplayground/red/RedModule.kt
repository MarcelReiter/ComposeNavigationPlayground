package com.anfema.composenavigationplayground.red

import com.anfema.composenavigationplayground.red.detail.RedDetailViewModel
import com.anfema.composenavigationplayground.red.main.RedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val redModule = module {
    viewModel { RedViewModel(get()) }
    viewModel { RedDetailViewModel(get()) }
}
