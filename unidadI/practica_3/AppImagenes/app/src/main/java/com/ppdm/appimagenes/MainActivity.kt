package com.ppdm.appimagenes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val images = listOf(
            ImageItem(R.drawable.imagen_torre_eiffel, "Torre Eiffel", "Monumento icónico en París."),
            ImageItem(R.drawable.imagen_torre_inclinada, "Torre Inclinada de Pisa", "La torre campanario de la catedral de Pisa."),
            ImageItem(R.drawable.imagen_estatua_libertad, "Estatua de la Libertad", "El monumento nacional de la Estatua de la Libertad."),
        )

        recyclerView.adapter = ImageAdapter(this, images)
    }
}
