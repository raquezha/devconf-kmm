package net.raquezha.devconf.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import net.raquezha.devconf.DesktopRootContent

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        DesktopRootContent()
    }
}
