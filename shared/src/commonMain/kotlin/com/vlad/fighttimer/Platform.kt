package com.vlad.fighttimer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform