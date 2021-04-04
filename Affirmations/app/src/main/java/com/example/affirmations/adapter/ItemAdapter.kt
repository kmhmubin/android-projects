package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R

import com.example.affirmations.model.Affirmation

//    pass the list of affirmations into the adapter and
// context object instance that pass into an ItemAdapter instance.
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // creating view holder for ItemAdapter
    // provide a reference to the views for each data item
    // provide access to all the views for a data item in a view holder
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // find the reference for the text view
        val textView: TextView = view.findViewById(R.id.item_title)

        // find the reference for the image view and assign image view property
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new views
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // replace the contents of a view by right data set
        // find the right affirmation object from the data set based on position
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //    return the size of the dataset
    override fun getItemCount(): Int {
        return dataset.size
    }
}