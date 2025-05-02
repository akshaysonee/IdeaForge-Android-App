package com.example.ideaforge

import android.net.Uri

data class Idea(
    val title: String,
    val description: String,
    val problem: String,
    val usp: String,
    val links: List<String> = emptyList(),
    val files: List<Uri> = emptyList(),
    val copiedFiles: List<String> = emptyList()
)
