package com.ppdm.appimagenes

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val context: Context, private val images: List<ImageItem>) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageViewItem)
        val textView: TextView = view.findViewById(R.id.textViewItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = images[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.textView.text = item.name

        holder.imageView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("imageResId", item.imageResId)
                putExtra("name", item.name)
                putExtra("description", item.description)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = images.size
}
