package com.example.basics

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio5)

        val btnMostrarImagen = findViewById<Button>(R.id.btnMostrarImagen)
        val ivImagen = findViewById<ImageView>(R.id.ivImagen)
        
        // La imagen inicia oculta
        ivImagen.visibility = View.GONE
        
        btnMostrarImagen.setOnClickListener {
            if (ivImagen.visibility == View.GONE) {
                ivImagen.visibility = View.VISIBLE
                btnMostrarImagen.text = "Ocultar Imagen"
                // Cargar el GIF del gato bailando
                ivImagen.setImageResource(R.drawable.cat_dancing)
            } else {
                ivImagen.visibility = View.GONE
                btnMostrarImagen.text = "Mostrar Imagen"
            }
        }
    }
}