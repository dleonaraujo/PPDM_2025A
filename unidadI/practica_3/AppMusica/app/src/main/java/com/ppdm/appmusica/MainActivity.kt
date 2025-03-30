package com.ppdm.appmusica

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private var isPlaying = false  // Controla si el audio está en reproducción

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonReproducir = findViewById<Button>(R.id.botonReproducir)
        val botonPausa = findViewById<Button>(R.id.botonPausa)
        val botonParar = findViewById<Button>(R.id.botonParar)

        mediaPlayer = MediaPlayer.create(this, R.raw.guns_sweet_child_o_mine)
    }
}