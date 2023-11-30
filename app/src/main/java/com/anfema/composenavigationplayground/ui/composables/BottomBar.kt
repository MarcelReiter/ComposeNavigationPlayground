package com.anfema.composenavigationplayground.ui.composables

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.anfema.composenavigationplayground.blue.BLUE_GRAPH
import com.anfema.composenavigationplayground.green.GREEN_GRAPH
import com.anfema.composenavigationplayground.red.RED_GRAPH
import com.anfema.composenavigationplayground.ui.theme.BlueColorScheme
import com.anfema.composenavigationplayground.ui.theme.ColorTheme
import com.anfema.composenavigationplayground.ui.theme.GreenColorScheme
import com.anfema.composenavigationplayground.ui.theme.RedColorScheme

enum class BottomBarItem(
    val text: String,
    val colorScheme: ColorScheme,
    val route: String,
) {
    RedBottomBarItem(
        text = "Red",
        colorScheme = RedColorScheme,
        route = RED_GRAPH,
    ),
    BlueBottomBarItem(
        text = "Blue",
        colorScheme = BlueColorScheme,
        route = BLUE_GRAPH
    ),
    GreenBottomBarItem(
        text = "Green",
        colorScheme = GreenColorScheme,
        route = GREEN_GRAPH
    )
}

@Composable
fun BottomBar(
    items: List<BottomBarItem>,
    isSelected: (BottomBarItem) -> Boolean,
    onClick: (BottomBarItem) -> Unit,
    modifier: Modifier = Modifier
) {
    BottomAppBar(modifier) {
        items.forEach { item ->
            NavigationBarItem(
                label = { Text(item.text) },
                icon = {
                    ColorTheme(colorScheme = item.colorScheme) {
                        val backgroundAlpha by animateFloatAsState(
                            if (isSelected(item)) 1f else 0.5f,
                            label = "bottomBarItemColor"
                        )

                        Box(
                            Modifier
                                .background(MaterialTheme.colorScheme.primary.copy(alpha = backgroundAlpha))
                                .size(20.dp)
                        )
                    }
                },
                selected = isSelected(item),
                onClick = { onClick(item) },
            )
        }
    }
}
