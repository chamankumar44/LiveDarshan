package com.example.first.test.oriental.mymultiplatformapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform