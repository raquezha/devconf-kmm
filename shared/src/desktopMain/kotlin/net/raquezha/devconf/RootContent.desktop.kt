package net.raquezha.devconf

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

/**
 * Created by raquezha on June 19, 2023
 */
@Preview
@Composable
fun DesktopRootContent() {
    RootContent()
}


@Preview
@Composable
fun BarChartPreview() {
    BarChart(
        data = mapOf(
            Pair(0.5F, "A"),
            Pair(0.6F, "B"),
            Pair(0.2F, "C"),
            Pair(0.7F, "D"),
            Pair(0.8F, "E"),
        ),
        maxValue = 1000
    )
}
