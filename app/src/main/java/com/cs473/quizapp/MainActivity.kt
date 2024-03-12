package com.cs473.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cs473.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener { onSubmitClick() }
    }

    private fun onSubmitClick() {
        val intent = Intent(this, SurveyQ::class.java)

        if (binding.food.isChecked) {
            startActivity(intent)
        } else {
            startActivity(intent)
        }
    }
}