package net.raquezha.devconf

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.raquezha.devconf.compose.theme.DevConfAppTheme

/**
 * Created by raquezha on June 18, 2023
 */

@Composable
internal fun RootContent() {
    DevConfAppTheme {   
        var text by remember { mutableStateOf("Hello, World!") }
        val platformName = getPlatform()

        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Shared UI",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(vertical = 32.dp)
            )
            Button(
                modifier = Modifier,
                onClick = {
                    text = "Hello, ${platformName.name}"
                }) {
                Text(text)
            }

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


    }
}
