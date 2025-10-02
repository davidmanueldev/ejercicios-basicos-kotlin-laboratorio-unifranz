package com.example.basics

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Ejercicio3Activity : AppCompatActivity() {
    private var esColorBlanco = true
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        val btnCambiarColor = findViewById<Button>(R.id.btnCambiarColor)
        val layoutPrincipal = findViewById<LinearLayout>(R.id.layoutPrincipal)
        
        btnCambiarColor.setOnClickListener {
            if (esColorBlanco) {
                layoutPrincipal.setBackgroundColor(Color.BLUE)
                esColorBlanco = false
            } else {
                layoutPrincipal.setBackgroundColor(Color.WHITE)
                esColorBlanco = true
            }
        }
    }
}