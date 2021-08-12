package com.ubaya.advnative_274458

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_toast = findViewById(R.id.btnToast) as Button
        btn_toast.setOnClickListener {
            Toast.makeText(this, "Toasted by Zefa!.", Toast.LENGTH_SHORT).show()
        }
    }
}