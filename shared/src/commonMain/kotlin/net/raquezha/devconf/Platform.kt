package net.raquezha.devconf

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform