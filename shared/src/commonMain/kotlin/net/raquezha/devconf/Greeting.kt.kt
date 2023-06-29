package net.raquezha.devconf

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {

        return "Hello, ${platform.name}"
    }
}
