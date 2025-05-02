package com.example.ideaforge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Bind the buttons
        val btnExploreIdeas = view.findViewById<Button>(R.id.btnExploreIdeas)
        val btnSubmitIdea = view.findViewById<Button>(R.id.btnSubmitIdea)
        val btnCollaborate = view.findViewById<Button>(R.id.btnCollaborate)
        val btnFindMentors = view.findViewById<Button>(R.id.btnFindMentors)

        // Bind the welcome text
        val welcomeText = view.findViewById<TextView>(R.id.welcomeText)

        // Setting up button listeners
        btnExploreIdeas.setOnClickListener {
            showToast("Explore Ideas clicked")
        }

        btnSubmitIdea.setOnClickListener {
            showToast("Submit Idea clicked")
        }

        btnCollaborate.setOnClickListener {
            showToast("Collaborate clicked")
        }

        btnFindMentors.setOnClickListener {
            showToast("Find Mentors clicked")
        }

        // Set the welcome text dynamically (just as an example)
        welcomeText.text = "Welcome, Ava!"

        return view
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }
}
