package com.anfema.composenavigationplayground.authentication

import org.koin.dsl.module

val authenticationModule = module {
    single { AuthenticationRepository() }
}
