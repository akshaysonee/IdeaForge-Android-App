package com.example.ideaforge

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate your XML
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Find all views
        val profileImage   = view.findViewById<ImageView>(R.id.profileImage)
        val profileName    = view.findViewById<TextView>(R.id.profileName)
        val profileEmail   = view.findViewById<TextView>(R.id.profileEmail)
        val profilePhone   = view.findViewById<TextView>(R.id.profilePhone)
        val profileAddress = view.findViewById<TextView>(R.id.profileAddress)
        val profileDob     = view.findViewById<TextView>(R.id.profileDob)
        val profileAbout   = view.findViewById<TextView>(R.id.profileAbout)
        val btnEdit        = view.findViewById<Button>(R.id.btnEditProfile)
        val btnLogout      = view.findViewById<Button>(R.id.btnLogout)

        // Populate with sample data (replace with real data as needed)
        profileImage.setImageResource(R.drawable.profile_pic)       // your drawable
        profileName.text    = "John Doe"
        profileEmail.text   = "john.doe@example.com"
        profilePhone.text   = "Phone Number: +91 9876543210"
        profileAddress.text = "Location: Bengaluru, India"
        profileDob.text     = "Date of Birth: January 1, 1990"
        profileAbout.text   = "Bio: A passionate individual with a keen interest in technology and innovation."

        // EDIT PROFILE click
        btnEdit.setOnClickListener {
            Toast.makeText(requireContext(), "Edit Profile Clicked", Toast.LENGTH_SHORT).show()
            // TODO: Launch your EditProfileActivity here:
            // startActivity(Intent(requireContext(), EditProfileActivity::class.java))
        }

        // LOGOUT click
        btnLogout.setOnClickListener {
            Toast.makeText(requireContext(), "Logged out", Toast.LENGTH_SHORT).show()
            // Clear backstack and go to login screen
            val intent = Intent(requireContext(), LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        return view
    }
}
