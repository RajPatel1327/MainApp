package com.example.mainapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val data = intent.getStringExtra("EXTRA_DATA")
        val textView = findViewById<TextView>(R.id.receivedData)
        textView.text = "Received data: $data"
    }
}
