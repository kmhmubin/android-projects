package com.example.recycleviewlistapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewlistapp.R

/*
1.our class will accept one parameter : country list => Mutable list
2.then extend the class into recyclerview adapter which create view holder for CardAdapter class
3.Create a inner class for accept the view into the Recycler view
4.import the member methods

 */
class CardAdapter(countryList: MutableList<String>) : RecyclerView.Adapter<CardAdapter.ViewHolder>() {
    // create a variable for the list
    private var countries: MutableList<String> = countryList


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // access the item object
        holder.itemTitle.text = countries[position]
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    // accept item in the view
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.itemImage)
        var itemTitle: TextView = itemView.findViewById(R.id.itemTitle)

        init {
            // when clicked show the toast message
            itemView.setOnClickListener {
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "Clicked ${countries[position]}", Toast.LENGTH_LONG).show()

            }
        }

        // add click listener for the card view


    }
}
