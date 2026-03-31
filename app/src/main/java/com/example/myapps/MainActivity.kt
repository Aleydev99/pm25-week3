package com.example.myapps

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val inputNama = findViewById<EditText>(R.id.editTextText)
        val tombolHello = findViewById<Button>(R.id.button)
        val teksHasil = findViewById<TextView>(R.id.textViewResult)

        tombolHello.setOnClickListener {
            val nama = inputNama.text.toString()
            if (nama.isNotEmpty()) {
                teksHasil.text = "Hello, $nama"
            } else {
                teksHasil.text = "Isi Duls!"
            }
        }
    }
}