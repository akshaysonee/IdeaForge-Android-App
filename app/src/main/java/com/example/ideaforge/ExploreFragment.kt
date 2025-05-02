package com.example.ideaforge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExploreFragment : Fragment() {

    private lateinit var ideaRecyclerView: RecyclerView
    private lateinit var ideaAdapter: IdeaAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate fragment_explore.xml
        val view = inflater.inflate(R.layout.fragment_explore, container, false)

        // Initialize RecyclerView and set up Adapter
        ideaRecyclerView = view.findViewById(R.id.ideaRecyclerView)

        // Set up RecyclerView layout and adapter
        ideaRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Fetch data for the RecyclerView, e.g., from your IdeaRepository or any other data source
        val ideaList = IdeaRepository.getAllIdeas()  // Replace with your data source
        ideaAdapter = IdeaAdapter(ideaList)
        ideaRecyclerView.adapter = ideaAdapter

        return view
    }
}
