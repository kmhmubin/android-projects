package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add reference link with the text view
        val textView: TextView = findViewById(R.id.textview)

        // get the total list from affirmation data source and call loadAffirmations() function
        textView.text = Datasource().loadAffirmations().size.toString()
    }
}