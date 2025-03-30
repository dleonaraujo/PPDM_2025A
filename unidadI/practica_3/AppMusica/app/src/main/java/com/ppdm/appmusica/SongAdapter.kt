package com.ppdm.appmusica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(
    private val canciones: List<String>,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val songTitle: TextView = itemView.findViewById(R.id.songTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_song, parent, false)
        return SongViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.songTitle.text = canciones[position]
        holder.itemView.setOnClickListener { onItemClick(canciones[position]) }
    }

    override fun getItemCount() = canciones.size
}
