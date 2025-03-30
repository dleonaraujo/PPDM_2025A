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

        val selectedSong = intent.getStringExtra("song_name")
        songTitle.text = selectedSong

        mediaPlayer = MediaPlayer.create(this, R.raw.guns_sweet_child_o_mine) // Ajustar según la canción

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
                mediaPlayer.prepare()
                isPlaying = false
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}
