package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AvengersActivity1: AppCompatActivity() {
    lateinit var editUsername: EditText
    lateinit var editPassword: EditText
    lateinit var btnLogin: Button
    private val validMobileNumber = "9999999999"
    private val validPassword = arrayOf<String>("thanos","tony","steve","bruce");
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.avengers_login)
        editUsername = findViewById(R.id.editUsername)
        editPassword = findViewById(R.id.editPassword)
        btnLogin = findViewById(R.id.btnLogin)

        // Lambda representation of implementing setOnClickListener().
        btnLogin.setOnClickListener() {
            val inputMobile = editUsername.text.toString();
            val inputPassword = editPassword.text.toString();
            // Check if the password is present in the array.
            if ((inputMobile == validMobileNumber) && (validPassword.contains(inputPassword))) {
                /* Start another activity on button click
                 * Intent(this@<This activity>,<Activity to open>) */
                val intent = Intent(this@AvengersActivity1, ScrollViewActivity::class.java)
                startActivity(intent)
            } else {
                // Showing a toast
                Toast.makeText(
                    this,
                    "Incorrect username / password.",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }
}