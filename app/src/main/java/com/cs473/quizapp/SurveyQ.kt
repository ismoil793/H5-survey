package com.cs473.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.cs473.quizapp.databinding.ActivitySurveyQBinding

class SurveyQ : AppCompatActivity() {
    private lateinit var binding: ActivitySurveyQBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySurveyQBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSubmit.setOnClickListener { onSubmitClick() }
    }


    private fun onSubmitClick() {
//        if(binding.chkQ2Ans1.isChecked && binding.chkQ2Ans2.isChecked)
        var food = ""
        var eatTime = ""
        var seafood = ""

        if (binding.rdQ1Ans1.isChecked) {
            food = "Chinese"
        } else if (binding.rdQ1Ans2.isChecked) {
            food = "Uzbek"
        } else if (binding.rdQ1Ans3.isChecked) {
            food = "American"
        } else if (binding.rdQ1Ans4.isChecked) {
            food = "Russian"
        }

        if (binding.q2Ans1.isChecked) {
            eatTime = "1"
        } else if (binding.q2Ans2.isChecked) {
            eatTime = "2"
        } else if (binding.q2Ans3.isChecked) {
            eatTime = "3"
        } else if (binding.q2Ans4.isChecked) {
            eatTime = "4"
        }

        if (binding.q3Ans1.isChecked) {
            seafood = "Yes"
        } else if (binding.q3Ans2.isChecked) {
            seafood = "No"
        }

        showResult("Survey Result", "Food: $food,  EatTime: $eatTime a day, Seafood preferred: $seafood")
    }

    private fun showResult(title: String, msg: String) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(msg)
        builder.setTitle(title)
        builder.setPositiveButton("OK") { dlgInterface, _ ->
            dlgInterface.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}