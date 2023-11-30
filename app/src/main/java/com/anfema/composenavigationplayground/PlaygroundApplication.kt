package com.anfema.composenavigationplayground

import android.app.Application
import com.anfema.composenavigationplayground.authentication.authenticationModule
import com.anfema.composenavigationplayground.blue.blueModule
import com.anfema.composenavigationplayground.green.greenModule
import com.anfema.composenavigationplayground.login.loginModule
import com.anfema.composenavigationplayground.main.mainModule
import com.anfema.composenavigationplayground.red.redModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PlaygroundApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(
                mainModule,
                authenticationModule,
                loginModule,
                blueModule,
                greenModule,
                redModule,
            )
        }
    }
}
