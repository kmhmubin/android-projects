package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View) {}
    fun onEqual(view: View) {}
    fun onOperator(view: View) {}
    fun onClear(view: View) {}
    fun onDecimalPoint(view: View) {}
}