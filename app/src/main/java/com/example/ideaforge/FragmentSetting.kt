package com.example.ideaforge

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment

class FragmentSetting : Fragment() {

    private var isDarkMode = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the settings layout
        val view = inflater.inflate(R.layout.fragment_setting, container, false)

        // ——— Find views by ID ———
        val layoutEditProfile     = view.findViewById<LinearLayout>(R.id.layoutEditProfile)
        val layoutChangePassword  = view.findViewById<LinearLayout>(R.id.layoutChangePassword)
        val switchNotifications   = view.findViewById<Switch>(R.id.switchNotifications)
        val switchDarkMode        = view.findViewById<Switch>(R.id.switchDarkMode)
        val layoutPrivacyPolicy   = view.findViewById<LinearLayout>(R.id.layoutPrivacyPolicy)
        val btnLogout             = view.findViewById<Button>(R.id.btnLogout)
        val txtVersion            = view.findViewById<TextView>(R.id.txtAppVersion)

        // ——— Populate static info ———
        txtVersion.text = "Version 1.0.0"  // or fetch dynamically

        // ——— Click Listeners ———
        layoutEditProfile.setOnClickListener {
            Toast.makeText(requireContext(), "Edit Profile tapped", Toast.LENGTH_SHORT).show()
            // TODO: navigate to EditProfile screen
        }

        layoutChangePassword.setOnClickListener {
            Toast.makeText(requireContext(), "Change Password tapped", Toast.LENGTH_SHORT).show()
            // TODO: navigate to ChangePassword screen
        }

        layoutPrivacyPolicy.setOnClickListener {
            Toast.makeText(requireContext(), "Privacy Policy tapped", Toast.LENGTH_SHORT).show()
            // TODO: open Privacy Policy URL or screen
        }

        // ——— Switch Listeners ———
        switchNotifications.setOnCheckedChangeListener { _, checked ->
            val msg = if (checked) "Notifications ON" else "Notifications OFF"
            Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
            // TODO: persist this preference
        }

        switchDarkMode.setOnCheckedChangeListener { _, checked ->
            isDarkMode = checked
            val mode = if (checked)
                AppCompatDelegate.MODE_NIGHT_YES
            else
                AppCompatDelegate.MODE_NIGHT_NO

            AppCompatDelegate.setDefaultNightMode(mode)
        }

        // ——— Logout ———
        btnLogout.setOnClickListener {
            Toast.makeText(requireContext(), "Logged out", Toast.LENGTH_SHORT).show()
            val intent = Intent(requireContext(), LoginActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
        }

        return view
    }
}
