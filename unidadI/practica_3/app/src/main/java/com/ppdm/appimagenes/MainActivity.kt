package com.ppdm.appimagenes

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)

        imageView.setOnClickListener {
            Toast.makeText(this, "Bienvenido a la Torre Eiffel!", Toast.LENGTH_SHORT).show()
        }
    }
}