package com.ppdm.app_edicion_perfil

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : ComponentActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etEdad: EditText
    private lateinit var etCiudad: EditText
    private lateinit var etCorreo: EditText

    companion object {
        const val CLAVE_USUARIO = "usuario"
    }

    private val resumenLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                Toast.makeText(this, "Perfil guardado correctamente", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        etNombre = findViewById(R.id.etNombre)
        etEdad = findViewById(R.id.etEdad)
        etCiudad = findViewById(R.id.etCiudad)
        etCorreo = findViewById(R.id.etCorreo)

        // Recuperar los datos si la pantalla se gira
        if (savedInstanceState != null) {
            etNombre.setText(savedInstanceState.getString("nombre"))
            etEdad.setText(savedInstanceState.getString("edad"))
            etCiudad.setText(savedInstanceState.getString("ciudad"))
            etCorreo.setText(savedInstanceState.getString("correo"))
        }

        val btnContinuar: Button = findViewById(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val usuario = Usuario(
                etNombre.text.toString(),
                etEdad.text.toString(),
                etCiudad.text.toString(),
                etCorreo.text.toString()
            )

            val intent = Intent(this, ResumenActivity::class.java)
            intent.putExtra(CLAVE_USUARIO, usuario)
            resumenLauncher.launch(intent)
        }
    }

    // Guardar los datos cuando se gira la pantalla
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nombre", etNombre.text.toString())
        outState.putString("edad", etEdad.text.toString())
        outState.putString("ciudad", etCiudad.text.toString())
        outState.putString("correo", etCorreo.text.toString())
    }
}
