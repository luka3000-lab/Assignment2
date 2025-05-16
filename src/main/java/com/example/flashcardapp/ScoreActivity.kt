package com.example.flashcardapp

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("SCORE", 0)
        val scoreText = findViewById<TextView>(R.id.textScore)
        val feedbackText = findViewById<TextView>(R.id.textFinalFeedback)
        val reviewBtn = findViewById<Button>(R.id.btnReview)
        val exitBtn = findViewById<Button>(R.id.btnExit)

        scoreText.text = "You scored $score out of 5"

        feedbackText.text = if (score >= 3) {
            "Great job!"
        } else {
            "Keep practising!"
        }

        reviewBtn.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Review Answers")
                .setMessage("""
                    Q1: True ✔️
                    Q2: False ❌
                    Q3: False ❌
                    Q4: True ✔️
                    Q5: False ❌
                """.trimIndent())
                .setPositiveButton("OK", null)
                .show()
        }

        exitBtn.setOnClickListener {
            finishAffinity() // Close all activities
        }
    }
}
