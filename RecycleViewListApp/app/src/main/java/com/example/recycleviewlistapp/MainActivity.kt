package com.example.recycleviewlistapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewlistapp.adapter.CardAdapter

class MainActivity : AppCompatActivity() {
    // creating objects
    private lateinit var recyclerView: RecyclerView
    private lateinit var cardAdapter: CardAdapter

    // creating the list
    private var countryList = mutableListOf<String>()
    private var displayList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creating a list
        countryList.add("Bangladesh")
        countryList.add("Brazil")
        countryList.add("Bhutan")
        countryList.add("Nepal")
        countryList.add("India")
        countryList.add("United State")
        countryList.add("United Kingdom")
        countryList.add("United Arab Emirath")
        countryList.add("Norway")
        countryList.add("Japan")
        countryList.add("China")

        // display the list

        displayList.addAll(countryList)

        // show the list into recycler view
        recyclerView = findViewById(R.id.recyclerView)
        // show the card adapter
        cardAdapter = CardAdapter(displayList)

        recyclerView.adapter = cardAdapter
    }
}