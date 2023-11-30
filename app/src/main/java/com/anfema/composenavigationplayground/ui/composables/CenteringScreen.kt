package com.anfema.composenavigationplayground.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CenteringScreen(
    topBar: @Composable () -> Unit,
    content: @Composable ColumnScope.() -> Unit
) {
    MinimalScreen(
        topBar = topBar
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            content = content
        )
    }
}


@Preview
@Composable
private fun CenteringScreenPreview() {
    CenteringScreen(
        topBar = {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.Green)
            )
        },
        content = {
            Text("Hello World")
        }
    )
}
