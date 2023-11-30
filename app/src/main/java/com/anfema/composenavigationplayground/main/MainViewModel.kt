package com.anfema.composenavigationplayground.main

import androidx.lifecycle.ViewModel
import com.anfema.composenavigationplayground.authentication.AuthenticationRepository
import kotlinx.coroutines.flow.StateFlow

class MainViewModel(
    repository: AuthenticationRepository
): ViewModel() {

    val isLoggedIn: StateFlow<Boolean> =
        repository.isLoggedIn
}
