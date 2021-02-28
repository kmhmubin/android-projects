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
            rollDice()
        }
    }

    private fun rollDice() {
//        assign the dice sides
        val dice = Dice(6)
//       save the result in the variable when dice roll
        val diceRoll = dice.roll()
//        display the result in the textview
        val resultTextView: TextView = findViewById(R.id.textView)
//        convert the result in to string
        resultTextView.text = diceRoll.toString()

    }
}

// Dice Class

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}