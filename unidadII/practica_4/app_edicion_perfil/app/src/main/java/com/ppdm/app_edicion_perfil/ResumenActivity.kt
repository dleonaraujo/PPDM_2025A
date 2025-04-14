package com.ppdm.app_edicion_perfil

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class ResumenActivity : ComponentActivity() {

    private lateinit var usuario: Usuario

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)

        // Accede al objeto Usuario desde el intent
        usuario = intent.getParcelableExtra(MainActivity.CLAVE_USUARIO)!!

        val tvResumen = findViewById<TextView>(R.id.tvResumen)
        tvResumen.text = """
            Nombre: ${usuario.nombre}
            Edad: ${usuario.edad}
            Ciudad: ${usuario.ciudad}
            Correo: ${usuario.correo}
        """.trimIndent()

        // Botón de Confirmar
        findViewById<Button>(R.id.btnConfirmar).setOnClickListener {
            setResult(Activity.RESULT_OK)  // Retorna el resultado OK
            finish()  // Termina la actividad
        }

        // Botón de Editar
        findViewById<Button>(R.id.btnEditar).setOnClickListener {
            setResult(Activity.RESULT_CANCELED)  // Retorna resultado CANCELED
            finish()  // Termina la actividad y vuelve a editar
        }
    }
}
