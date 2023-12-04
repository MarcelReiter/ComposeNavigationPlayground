package com.anfema.composenavigationplayground.blue

import com.anfema.composenavigationplayground.blue.detail.BlueDetailViewModel
import com.anfema.composenavigationplayground.blue.main.BlueViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val blueModule = module {
    viewModel { BlueViewModel(get()) }
    viewModel { BlueDetailViewModel(get()) }
}
