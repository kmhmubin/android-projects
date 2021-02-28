package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// assign a variable for the button
        val rollButton: Button = findViewById(R.id.button)
//        add an event listener for the button
        rollButton.setOnClickListener {
//            when the button pressed the text will change
            val resultTextView: TextView = findViewById(R.id.textView)
//            assign the text result beforehand
            resultTextView.text = "6"
        }
    }
}