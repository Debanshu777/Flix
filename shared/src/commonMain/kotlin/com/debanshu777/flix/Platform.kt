package com.debanshu777.flix

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform