package com.ppdm.editornotasapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.ppdm.app_editor_notas.R

class MainActivity : Activity() {
    private lateinit var notaEditText: EditText
    private val REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notaEditText = findViewById(R.id.notaEditText)
        val btnCompartir = findViewById<Button>(R.id.btnCompartir)
        
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            val nuevaNota = data?.getStringExtra("nota")
            notaEditText.setText(nuevaNota)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nota_guardada", notaEditText.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        notaEditText.setText(savedInstanceState.getString("nota_guardada", ""))
    }
}
