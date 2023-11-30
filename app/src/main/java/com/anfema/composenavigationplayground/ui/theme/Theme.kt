package com.anfema.composenavigationplayground.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

val RedColorScheme = lightColorScheme(
    primary = DarkRed,
    surface = LightRed,
    background = EvenLighterRed
)

val BlueColorScheme = lightColorScheme(
    primary = DarkBlue,
    surface = LightBlue,
    background = EvenLighterBlue
)

val GreenColorScheme = lightColorScheme(
    primary = DarkGreen,
    surface = LightGreen,
    background = EvenLighterGreen
)

val PurpleColorScheme = lightColorScheme(
    primary = DarkPurple,
    surface = LightPurple,
    background = EvenLighterPurple
)

@Composable
fun ColorTheme(
    colorScheme: ColorScheme,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}

@Composable
fun ComposeNavigationPlaygroundTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}
