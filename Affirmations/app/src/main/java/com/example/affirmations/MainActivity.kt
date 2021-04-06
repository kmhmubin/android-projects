package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize data
        val myDataset = Datasource().loadAffirmations()

        // find the reference to the Recycler view within the layout
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // assign the ItemAdapter object to the adapter property of the recyclerview
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // content do not change the layout size of the Recyclerview
        recyclerView.setHasFixedSize(true)


    }
}