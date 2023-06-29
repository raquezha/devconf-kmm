package net.raquezha.devconf

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

/**
 * Created by raquezha on June 15, 2023
 */
@Preview(
    name = "Small Font",
    group = "Small Font Group",
    fontScale = 0.5f,
    uiMode = UI_MODE_NIGHT_NO
)
@Preview(
    name = "Small Font",
    group = "Small Font Group",
    fontScale = 0.5f,
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    name = "Normal Font",
    group = "Normal Font Group",
    uiMode = UI_MODE_NIGHT_NO
)
@Preview(
    name = "Normal Font",
    group = "Normal Font Group",
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    name = "Large Font",
    group = "Normal Font Group",
    fontScale = 1.5f,
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    name = "Large Font",
    group = "Normal Font Group",
    fontScale = 1.5f,
    uiMode = UI_MODE_NIGHT_YES
)
annotation class FontScalePreviews

@Preview(name = "Pixel XL", group = "Devices",  device = Devices.PIXEL_XL, showSystemUi = true)
@Preview(name = "Pixel 2", group = "Devices",  device = Devices.PIXEL_2, showSystemUi = true)
@Preview(name = "Pixel 3", group = "Devices",  device = Devices.PIXEL_3, showSystemUi = true)
@Preview(name = "Pixel 4", group = "Devices",  device = Devices.PIXEL_4, showSystemUi = true)
@Preview(name = "Pixel C", group = "Devices",  device = Devices.PIXEL_C, showSystemUi = true)
@Preview(name = "Foldable", group = "Devices",  device = Devices.FOLDABLE, showSystemUi = true)
annotation class DevicePreviews

