package net.raquezha.devconf

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion + "\n Hi RMRRR! hihi"
}

actual fun getPlatform(): Platform = IOSPlatform()
