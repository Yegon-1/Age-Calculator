package com.example.practiceapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), UserData, Navigator {

    private var name: String = ""
    private var yearOfBirth: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener {
            name = editTextName.text.toString()
            yearOfBirth = editTextYear.text.toString().toInt()
            navigateToDisplayActivity(name, yearOfBirth)
        }
    }

    private fun navigateToDisplayActivity(name: String, yearOfBirth: Int) {
        val intent = Intent(this, DisplayActivity::class.java).apply {
            putExtra("name", name)
            putExtra("yearOfBirth", yearOfBirth)
        }
        startActivity(intent)
    }
}