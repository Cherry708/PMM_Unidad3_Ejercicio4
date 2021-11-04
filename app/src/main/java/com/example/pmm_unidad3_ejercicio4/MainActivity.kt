package com.example.pmm_unidad3_ejercicio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etContrasena = findViewById<EditText>(R.id.etContrasena)

        val cbRecordar = findViewById<CheckBox>(R.id.cbRecordar)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val msgIntroduceUsuario = "No has escrito el nombre de usuario"
        val msgIntroduceContrasena = "No has escrito la contraseña del usuario"

        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
        btnEntrar.setOnClickListener {
            if (etUsuario.text.toString() == "" )
                tvResultado.text = msgIntroduceUsuario
            else if (etContrasena.text.toString() == "")
                tvResultado.text = msgIntroduceContrasena

            if (etUsuario.text.toString() != "" && etContrasena.text.toString() != ""){
                val usuario = etUsuario.text.toString()
                val contrasena = etContrasena.text.toString()
                val msgEntrar = "Has escrito el usuario '$usuario' y la contraseña '$contrasena'"
                tvResultado.text = msgEntrar
            }

            if (etUsuario.text.toString() != "" && etContrasena.text.toString() != "" && cbRecordar.isChecked){
                val usuario = etUsuario.text.toString()
                val contrasena = etContrasena.text.toString()
                val msgEntrar = "Has escrito el usuario '$usuario' y la contraseña '$contrasena'." +
                        " La contraseña se guardará."
                tvResultado.text = msgEntrar
            }
        }
    }
}