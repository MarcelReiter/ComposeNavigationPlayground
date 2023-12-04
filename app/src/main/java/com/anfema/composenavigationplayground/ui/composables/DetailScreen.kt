package com.anfema.composenavigationplayground.ui.composables

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    name: String,
    onNavigateBack: () -> Unit,
    actions: @Composable RowScope.() -> Unit,
    content: @Composable ColumnScope.() -> Unit
) {
    CenteringScreen(
        topBar = {
            LargeTopAppBar(
                title = { Text("$name Detail Screen") },
                navigationIcon = {
                    Button(
                        onClick = onNavigateBack,
                        text = "<"
                    )
                },
                actions = actions
            )
        },
        content = content,
    )
}
