package com.ppdm.app_edicion_perfil

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResumenActivity : AppCompatActivity() {

    private lateinit var usuario: Usuario

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)

        usuario = intent.getParcelableExtra(FormularioActivity.CLAVE_USUARIO)!!

        val tvResumen = findViewById<TextView>(R.id.tvResumen)
        tvResumen.text = """
            Nombre: ${usuario.nombre}
            Edad: ${usuario.edad}
            Ciudad: ${usuario.ciudad}
            Correo: ${usuario.correo}
        """.trimIndent()

        findViewById<Button>(R.id.btnConfirmar).setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }

        findViewById<Button>(R.id.btnEditar).setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }
    }
}
