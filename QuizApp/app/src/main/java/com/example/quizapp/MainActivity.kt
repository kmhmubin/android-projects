package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        actionBar?.hide()

        // when start pressed go to question page
        val buttonStart: Button = findViewById(R.id.btn_start)
        buttonStart.setOnClickListener {
            val enterName: EditText = findViewById(R.id.et_name)
            if (enterName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                // after inter name got to quiz question page
                val intent = Intent(this, QuizQuestionActivity::class.java)
                // start new activity and finish this activity
                startActivity(intent)
                finish()
            }
        }

    }
}