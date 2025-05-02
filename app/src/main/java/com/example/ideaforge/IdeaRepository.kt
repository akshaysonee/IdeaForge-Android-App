package com.example.ideaforge

import android.net.Uri

object IdeaRepository {

    // Mutable list to hold ideas
    private val ideaList = mutableListOf<Idea>()

    // Function to get all ideas
    fun getAllIdeas(): List<Idea> = ideaList

    // Function to add a new idea
    fun addIdea(idea: Idea) {
        ideaList.add(idea)
    }
}
