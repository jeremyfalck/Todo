package com.jfalck.todo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform