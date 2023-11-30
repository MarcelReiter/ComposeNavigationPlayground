package com.anfema.composenavigationplayground.login

import android.util.Log
import androidx.lifecycle.ViewModel
import com.anfema.composenavigationplayground.authentication.AuthenticationRepository

class LoginViewModel(
    private val repository: AuthenticationRepository
) : ViewModel() {

    init {
        Log.d("Lifecycle", "Created $this")
    }

    fun login() {
        repository.login()
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("Lifecycle", ">Cleared $this")
    }
}
