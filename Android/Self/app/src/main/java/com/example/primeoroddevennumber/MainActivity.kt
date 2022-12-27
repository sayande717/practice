package com.example.primeoroddevennumber
/* Things to learn:
 * For loop:
 * 1. 1..5 means 1 to 5
 * 1 until 5 means 1 to 4
 *
 * Hiding the keyboard after pressing a button: check function -> hideSoftKeyboard()
 * */
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import java.security.KeyStore.TrustedCertificateEntry

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputNumber = findViewById<EditText>(R.id.inputField)
        val evenSubmit = findViewById<Button>(R.id.btnOddEven)
        val primeSubmit = findViewById<Button>(R.id.btnPrime)
        val resultField = findViewById<TextView>(R.id.outputField)
        var result = false
        evenSubmit.setOnClickListener {
            hideSoftKeyboard(it)
            if(inputNumber.toString() == "") {
                emptyInputFieldToast()
            }

            result = isEven(inputNumber.text.toString().toInt())

            if(result) {
                resultField.setTextColor(ContextCompat.getColor(this,R.color.resultTrue))
                resultField.text = "Even"
            }
            else {
                resultField.setTextColor(ContextCompat.getColor(this,R.color.resultFalse))
                resultField.text = "Odd"
            }
        }
        primeSubmit.setOnClickListener {
            if (inputNumber.toString() == "") {
                emptyInputFieldToast()
            }
            hideSoftKeyboard(it)
            result = isPrime(inputNumber.text.toString().toInt())
            if(result) {
                resultField.setTextColor(ContextCompat.getColor(this,R.color.resultTrue))
                resultField.text = "Prime"
            }
            else {
                resultField.setTextColor(ContextCompat.getColor(this,R.color.resultFalse))
                resultField.text = "Not Prime"
            }
        }
    }
    private fun isEven(number: Int) : Boolean {
        return (number % 2 == 0)
    }
    private fun isPrime(number: Int) : Boolean {
        var counter = 0

        for (i in 2 until number) {
            if(number % i == 0) {
                counter++;
            }
        }
        return (counter == 0)
    }
    private fun emptyInputFieldToast() {
        Toast.makeText(this, "Please input a number!", Toast.LENGTH_SHORT).show()
    }
    private fun hideSoftKeyboard(view: View) {
        val manager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        manager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}