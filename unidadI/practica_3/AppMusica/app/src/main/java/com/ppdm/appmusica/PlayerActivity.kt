package com.ppdm.appmusica

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlayerActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private var isPlaying = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        val songTitle = findViewById<TextView>(R.id.songTitle)
        val btnPlay = findViewById<Button>(R.id.botonReproducir)
        val btnPause = findViewById<Button>(R.id.botonPausa)
        val btnStop = findViewById<Button>(R.id.botonParar)

        // Obtener el nombre y el ID del recurso de la canción
        val selectedSong = intent.getStringExtra("song_name")
        val songResId = intent.getIntExtra("song_res_id", 0) // ID del recurso

        songTitle.text = selectedSong

        if (songResId != 0) {
            mediaPlayer = MediaPlayer.create(this, songResId) // Usar el ID recibido
        } else {
            finish() // Cerrar la actividad si no se recibió un ID válido
        }

        btnPlay.setOnClickListener {
            if (!isPlaying) {
                mediaPlayer.start()
                isPlaying = true
            }
        }

        btnPause.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                isPlaying = false
            }
        }

        btnStop.setOnClickListener {
            if (isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.prepare() // Repreparar para poder reproducir otra vez
                isPlaying = false
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}

