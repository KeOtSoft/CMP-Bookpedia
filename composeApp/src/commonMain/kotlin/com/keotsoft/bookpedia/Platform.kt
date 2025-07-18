package com.keotsoft.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform