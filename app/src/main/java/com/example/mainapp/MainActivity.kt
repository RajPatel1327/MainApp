package com.example.mainapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataInput = findViewById<EditText>(R.id.dataInput)
        val buttonCalculator = findViewById<Button>(R.id.button_calculator)
        val buttonSpinner = findViewById<Button>(R.id.button_spinner)

        buttonCalculator.setOnClickListener {
            val data = dataInput.text.toString()
            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("EXTRA_DATA", data)
            startActivity(intent)
        }

        buttonSpinner.setOnClickListener {
            val data = dataInput.text.toString()
            val intent = Intent(this, SpinnerActivity::class.java)
            intent.putExtra("EXTRA_DATA", data)
            startActivity(intent)
        }
    }
}
