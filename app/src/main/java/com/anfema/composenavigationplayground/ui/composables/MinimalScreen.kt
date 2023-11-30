package com.anfema.composenavigationplayground.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MinimalScreen(
    topBar: @Composable () -> Unit,
    content: @Composable BoxScope.() -> Unit
) {
    Scaffold(topBar = topBar) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            content = content,
        )
    }
}

@Preview
@Composable
private fun MinimalScreenPreview() {
    MinimalScreen(
        topBar = {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.Green)
            )
        },
        content = {}
    )
}
