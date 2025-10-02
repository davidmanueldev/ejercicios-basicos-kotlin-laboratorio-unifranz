package com.example.basics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio4Activity : AppCompatActivity() {
    private var contador = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)

        val btnIncrementar = findViewById<Button>(R.id.btnIncrementar)
        val tvContador = findViewById<TextView>(R.id.tvContador)
        
        // Mostrar el valor inicial
        tvContador.text = contador.toString()
        
        btnIncrementar.setOnClickListener {
            contador++
            tvContador.text = contador.toString()
        }
    }
}