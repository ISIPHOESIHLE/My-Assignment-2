package com.example.myassignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener{
            intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}