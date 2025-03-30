package com.ppdm.appmusica

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val canciones = listOf(
        "Guns N' Roses - Sweet Child O' Mine",
        "Queen - Cool Cat",
        "Guns N' Roses - November Rain"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SongAdapter(canciones) { selectedSong ->
            val intent = Intent(this, PlayerActivity::class.java)
            intent.putExtra("song_name", selectedSong)
            startActivity(intent)
        }
    }
}
