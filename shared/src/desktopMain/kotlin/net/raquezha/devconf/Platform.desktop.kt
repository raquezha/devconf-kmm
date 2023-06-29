package net.raquezha.devconf

class Desktop : Platform {
    override val name: String = "Desktop"
}

actual fun getPlatform(): Platform = Desktop()
