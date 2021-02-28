package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // assign a variable for the button
        val rollButton: Button = findViewById(R.id.button)
        // add an event listener for the button
        rollButton.setOnClickListener { rollDice() }
    }

/*

Roll the dice and update the screen with the result.
 */

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

    }
}

// Dice Class

class Dice(private val numSides: Int) {
    // return random value based on Dice side number
    fun roll(): Int {
        return (1..numSides).random()
    }
}