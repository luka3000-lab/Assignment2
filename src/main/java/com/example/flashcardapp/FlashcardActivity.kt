package com.example.flashcardapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FlashcardActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Nelson Mandela was the president in 1994", // true
        "The sun rises in the west", // false
        "Water boils at 90°C", // false
        "The capital of South Africa is Pretoria", // true
        "Sharks are mammals" // false
    )

    private val answers = booleanArrayOf(true, false, false, true, false)
    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        val questionText = findViewById<TextView>(R.id.textQuestion)
        val trueBtn = findViewById<Button>(R.id.btnTrue)
        val falseBtn = findViewById<Button>(R.id.btnFalse)
        val nextBtn = findViewById<Button>(R.id.btnNext)
        val feedback = findViewById<TextView>(R.id.textFeedback)

        questionText.text = questions[currentQuestionIndex]


        @SuppressLint("SetTextI18n")
        fun checkAnswer(userAnswer: Boolean) {
            if (userAnswer == answers[currentQuestionIndex]) {
                score++
                "Correct!".also { feedback.text = it }
            } else {
                "Incorrect!".also { feedback.text = it }
            }
        }

        trueBtn.setOnClickListener { checkAnswer(true) }
        falseBtn.setOnClickListener { checkAnswer(false) }

        nextBtn.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                questionText.text = questions[currentQuestionIndex]
                feedback.text = ""
            } else {
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("SCORE", score)
                startActivity(intent)
                finish()
            }
        }
    }
}
