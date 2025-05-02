package com.example.ideaforge

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment

class CreateFragment : Fragment() {

    private var linkCount = 0
    private val links = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_create, container, false)

        val problemEt = view.findViewById<EditText>(R.id.problemEditText)
        val titleEt = view.findViewById<EditText>(R.id.ideaTitleEditText)
        val descEt = view.findViewById<EditText>(R.id.ideaDescriptionEditText)
        val uspEt = view.findViewById<EditText>(R.id.uspEditText)
        val addLinkBtn = view.findViewById<Button>(R.id.addLinkButton)
        val linkCountTv = view.findViewById<TextView>(R.id.linkCountTextView)
        val postIdeaBtn = view.findViewById<Button>(R.id.postIdeaButton)

        // Function to enable/disable the "Post Idea" button
        fun updatePostEnabled() {
            postIdeaBtn.isEnabled =
                problemEt.text.isNotBlank() &&
                        titleEt.text.isNotBlank() &&
                        descEt.text.isNotBlank() &&
                        uspEt.text.isNotBlank()
        }

        // Adding TextWatcher for input validation
        val watcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) = updatePostEnabled()
            override fun beforeTextChanged(s: CharSequence?, st: Int, c: Int, a: Int) = Unit
            override fun onTextChanged(s: CharSequence?, st: Int, b: Int, c: Int) = Unit
        }
        problemEt.addTextChangedListener(watcher)
        titleEt.addTextChangedListener(watcher)
        descEt.addTextChangedListener(watcher)
        uspEt.addTextChangedListener(watcher)

        // Initialize link counter
        linkCountTv.text = "(0)"

        // Add link button functionality
        addLinkBtn.setOnClickListener {
            // Simulating adding a link. You can replace it with a real link dialog.
            links.add("http://example.com/${links.size + 1}")
            linkCount = links.size
            linkCountTv.text = "($linkCount)"
            Toast.makeText(requireContext(), "Link added", Toast.LENGTH_SHORT).show()
        }

        // Post idea button functionality
        postIdeaBtn.setOnClickListener {
            val idea = Idea(
                title = titleEt.text.toString().trim(),
                description = descEt.text.toString().trim(),
                problem = problemEt.text.toString().trim(),
                usp = uspEt.text.toString().trim(),
                links = links.toList()  // Convert to a list for immutability
            )
            IdeaRepository.addIdea(idea)  // Add the idea to the repository
            Toast.makeText(requireContext(), "Idea posted!", Toast.LENGTH_SHORT).show()

            // Clear fields after posting
            problemEt.text.clear()
            titleEt.text.clear()
            descEt.text.clear()
            uspEt.text.clear()
            links.clear()
            linkCountTv.text = "(0)"
        }

        // Initially disable the post button
        postIdeaBtn.isEnabled = false
        return view
    }
}
