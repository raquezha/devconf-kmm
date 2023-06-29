package net.raquezha.devconf

class JS : Platform {
    override val name: String = "from Js"
}

actual fun getPlatform(): Platform = JS()
