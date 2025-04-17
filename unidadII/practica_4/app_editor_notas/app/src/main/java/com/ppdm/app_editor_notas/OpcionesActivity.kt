package com.ppdm.app_editor_notas

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class OpcionesActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        val notaRecibida = intent.getStringExtra("nota")
        val textViewNota = findViewById<TextView>(R.id.textViewNota)
        textViewNota.text = notaRecibida

        val btnCorreo = findViewById<Button>(R.id.btnCorreo)
        val btnEditar = findViewById<Button>(R.id.btnEditar)

        btnCorreo.setOnClickListener {
            Toast.makeText(this, "Compartido por correo", Toast.LENGTH_SHORT).show()
        }

        btnEditar.setOnClickListener {
            val intentDeVuelta = Intent()
            intentDeVuelta.putExtra("nota", notaRecibida)
            setResult(RESULT_OK, intentDeVuelta)
            finish()
        }
    }
}
