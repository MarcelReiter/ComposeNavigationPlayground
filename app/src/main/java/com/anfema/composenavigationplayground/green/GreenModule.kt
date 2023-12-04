package com.anfema.composenavigationplayground.green


import com.anfema.composenavigationplayground.green.detail.GreenDetailViewModel
import com.anfema.composenavigationplayground.green.main.GreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val greenModule = module {
    viewModel { GreenViewModel(get()) }
    viewModel { GreenDetailViewModel(get()) }
}
