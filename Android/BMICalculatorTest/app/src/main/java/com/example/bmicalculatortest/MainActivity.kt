package com.example.bmicalculatortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weightValue = findViewById<EditText>(R.id.inputWeight)
        val heightValue = findViewById<EditText>(R.id.inputHeight)
        val submitButton = findViewById<Button>(R.id.btnSubmit)

        submitButton.setOnClickListener {
            var weight = weightValue.text.toString()
            var height = heightValue.text.toString()
            if(weight.isNullOrEmpty()) {
                Toast.makeText(this,"Please input weight",Toast.LENGTH_LONG).show()
            }
            else if (height.isNullOrEmpty()) {
                Toast.makeText(this,"Please input height",Toast.LENGTH_LONG).show()
            }
            else {
                val valueHeight = height.toFloat() / 100
                val valueWeight = weight.toFloat()
                val bmi = String.format("%.2f",valueWeight / (valueHeight/100 * valueHeight)).toFloat()
                displayResult(bmi)
            }

        }
    }

    private fun displayResult(bmi: Float) {
        val resultOutput = findViewById<TextView>(R.id.tvResultOutput)
        val resultDescription = findViewById<TextView>(R.id.tvResultDesc)
        resultOutput.text = bmi.toString()

        var resultText = ""
        var color = 0
        if (bmi <= 18.5) {
            resultText = "Underweight"
            color = R.color.resultUnderweight
        }
        else if (bmi <= 24.9) {
            resultText = "Healthy Weight"
            color = R.color.resultHealthy
        }
        else if (bmi <= 29.9) {
            resultText = "Overweight"
            color = R.color.resultOverweight
        }
        else if (bmi <= 34.9) {
            resultText = "Obese-Class 1"
            color = R.color.resultObese1
        }
        else if(bmi <= 39.9) {
            resultText = "Obese-Class 2"
            color = R.color.resultObese2
        }
        else {
            resultText = "Obese-Class 3"
            color = R.color.resultObese3
        }
        // Set the colour of the textView.
        resultDescription.setTextColor(ContextCompat.getColor(this,color))
        resultDescription.text = resultText
    }
}