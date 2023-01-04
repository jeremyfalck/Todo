package com.jfalck.domain

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform