package com.ppdm.app_edicion_perfil

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etEdad: EditText
    private lateinit var etCiudad: EditText
    private lateinit var etCorreo: EditText

    companion object {
        const val CLAVE_USUARIO = "usuario"
    }

}
