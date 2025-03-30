package com.ppdm.appmusica

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val canciones = listOf(
        Song("Guns N' Roses - Sweet Child O' Mine", R.raw.guns_sweet_child_o_mine),
        Song("Queen - Cool Cat", R.raw.queen_cool_cat),
        Song("Guns N' Roses - November Rain", R.raw.guns_november_rain)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SongAdapter(canciones) { selectedSong ->
            val intent = Intent(this, PlayerActivity::class.java)
            intent.putExtra("song_name", selectedSong.name) // Enviar el nombre
            intent.putExtra("song_res_id", selectedSong.resourceId) // Enviar el ID del recurso
            startActivity(intent)
        }
    }
}
