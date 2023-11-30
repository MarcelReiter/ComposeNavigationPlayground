package com.anfema.composenavigationplayground.loggedIn

import android.util.Log
import androidx.lifecycle.ViewModel
import com.anfema.composenavigationplayground.authentication.AuthenticationRepository

class LoggedInViewModel(
    private val repository: AuthenticationRepository
) : ViewModel() {

    init {
        Log.d("Lifecycle", "Created $this")
    }

    fun logout() {
        repository.logout()
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("Lifecycle", ">Cleared $this")
    }
}
