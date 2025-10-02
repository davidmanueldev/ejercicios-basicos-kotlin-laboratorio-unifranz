package com.example.basics

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ejercicio1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        val btnMostrarToast = findViewById<Button>(R.id.btnMostrarToast)
        
        btnMostrarToast.setOnClickListener {
            Toast.makeText(this, "Hola Mundo", Toast.LENGTH_SHORT).show()
        }
    }
}