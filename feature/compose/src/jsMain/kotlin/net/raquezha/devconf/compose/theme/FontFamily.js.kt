package net.raquezha.devconf.compose.theme

/**
 * Created by raquezha on June 20, 2023
 */
class JsFontFamily: DevConfFontFamily

actual fun getFontFamily(): DevConfFontFamily = JsFontFamily()
