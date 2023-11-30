package com.anfema.composenavigationplayground.authentication

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

// This is ofc only a dummy implementation
class AuthenticationRepository {

    private val _isLoggedIn = MutableStateFlow(false)
    val isLoggedIn = _isLoggedIn.asStateFlow()

    fun login(){
        _isLoggedIn.value = true
    }

    fun logout(){
        _isLoggedIn.value = false
    }
}
