package net.raquezha.devconf

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun BarChart(
    data: Map<Float, String>,
    maxValue: Int
) {
    val barHeight by remember { mutableStateOf(200.dp) }
    val barWidth by remember { mutableStateOf(20.dp) }
    val scaleYAxisWidth by remember { mutableStateOf(50.dp) }
    val scaleLineWidth by remember { mutableStateOf(2.dp) }

    Column(
        modifier = Modifier
            .padding(50.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(barHeight),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
            // scale Y-Axis
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(scaleYAxisWidth),
                contentAlignment = Alignment.BottomCenter
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    // the maxvalue must refer to the maxValue of map.key
                    Text(text = maxValue.toString(), color = Color.Magenta)
                    Spacer(modifier = Modifier.fillMaxHeight())
                }
                //2nd Scale
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(text = (maxValue / 2).toString(), color = Color.Magenta)
                    Spacer(modifier = Modifier.fillMaxHeight(0.5f))
                }
            }
            // Y-Axis Line - Grid line
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(scaleLineWidth)
                    .background(Color.Magenta)
            )

            // graph
            data.forEach {
                var animationTriggered by remember {
                    mutableStateOf(false)
                }

                val animateBarHeight by animateFloatAsState(
                    targetValue = if (animationTriggered) it.key else 0f,
                    animationSpec = tween(
                        durationMillis = 500,
                        delayMillis = 0,
                        easing = FastOutLinearInEasing
                    )
                )
                LaunchedEffect(key1 = true){
                    animationTriggered = true
                }
                Box(modifier = Modifier
                    .padding(start = barWidth, bottom = 5.dp)
                    .clip(CircleShape)
                    .width(barWidth)
                    .fillMaxHeight(animateBarHeight)
                    .background(Color.Blue)
                    .clickable {

                    }
                )
            }
        }

        // X-Axis Line
        Box(
            modifier = Modifier
                .padding(start = scaleYAxisWidth)
                .fillMaxWidth()
                .height(scaleLineWidth)
                .background(Color.Yellow)
        )

        // Scale X-Axis
        Row(
            modifier = Modifier
                .padding(start = scaleYAxisWidth + barWidth + scaleLineWidth)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(barWidth),
        ) {
            data.values.forEach {
                Text(
                    text = it,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(barWidth),
                    color = Color.Yellow
                )
            }
        }
    }
}
