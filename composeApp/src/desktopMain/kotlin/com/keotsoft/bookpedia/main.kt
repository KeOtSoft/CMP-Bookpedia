package com.keotsoft.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.keotsoft.bookpedia.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CMP-Bookpedia",
    ) {
        App()
    }
}