package com.example.practiceapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Initialize UI components
        val titleTextView: TextView = findViewById(R.id.titleTextView)
        val displayImageView: ImageView = findViewById(R.id.displayImageView)
        val descriptionTextView: TextView = findViewById(R.id.descriptionTextView)
        val backButton: Button = findViewById(R.id.backButton)

        // Set values or listeners
        titleTextView.text = "Display Activity"
        descriptionTextView.text = "This is an example description."

        // Handle back button click
        backButton.setOnClickListener {
            finish() // Close this activity and go back to the previous one
        }
    }
}


