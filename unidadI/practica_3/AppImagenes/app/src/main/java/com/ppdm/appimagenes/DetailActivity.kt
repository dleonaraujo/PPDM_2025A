package com.ppdm.appimagenes

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageView: ImageView = findViewById(R.id.imageViewDetail)
        val textViewName: TextView = findViewById(R.id.textViewName)
        val textViewDescription: TextView = findViewById(R.id.textViewDescription)

        val imageResId = intent.getIntExtra("imageResId", 0)
        val name = intent.getStringExtra("name") ?: ""
        val description = intent.getStringExtra("description") ?: ""

        imageView.setImageResource(imageResId)
        textViewName.text = name
        textViewDescription.text = description

        imageView.setOnClickListener {
            Toast.makeText(this, "Bienvenido a $name!", Toast.LENGTH_SHORT).show()
        }
    }
}
