package com.example.bmicalculatortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weightValue = findViewById<EditText>(R.id.inputWeight)
        val heightValue = findViewById<EditText>(R.id.inputHeight)
        val submitButton = findViewById<Button>(R.id.btnSubmit)

        submitButton.setOnClickListener {
            val weight = weightValue.text.toString().toFloat()
            val height = heightValue.text.toString().toFloat() / 100
            val bmi = String.format("%.2f",weight / (height * height)).toFloat()
            displayResult(bmi)
        }
    }
    private fun displayResult(bmi: Float) {
        val resultOutput = findViewById<TextView>(R.id.tvResultOutput)
        val resultDescription = findViewById<TextView>(R.id.tvResultDesc)
        resultOutput.text = bmi.toString()
        if (bmi <= 18.5) {
            resultDescription.text = "Underweight"
        }
        else if (bmi <= 24.9) {
            resultDescription.text = "Healthy Weight"
        }
        else if (bmi <= 29.9) {
            resultDescription.text = "Overweight"
        }
        else if (bmi <= 34.9) {
            resultDescription.text = "Obese-Class 1"
        }
        else if(bmi <= 39.9) {
            resultDescription.text = "Obese-Class 2"
        }
        else {
            resultDescription.text = "Obese-Class 3"
        }
    }
}