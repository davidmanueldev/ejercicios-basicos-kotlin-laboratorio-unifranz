package com.example.basics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        val btnCambiarTexto = findViewById<Button>(R.id.btnCambiarTexto)
        val tvTexto = findViewById<TextView>(R.id.tvTexto)
        
        btnCambiarTexto.setOnClickListener {
            tvTexto.text = "¡Has presionado el botón!"
        }
    }
}