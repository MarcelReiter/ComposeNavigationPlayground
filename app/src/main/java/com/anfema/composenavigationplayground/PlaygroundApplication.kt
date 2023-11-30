package com.anfema.composenavigationplayground

import android.app.Application
import com.anfema.composenavigationplayground.authentication.authenticationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PlaygroundApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(
                authenticationModule
            )
        }
    }
}
