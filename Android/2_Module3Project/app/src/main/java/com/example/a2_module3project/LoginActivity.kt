package com.example.a2_module3project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val inputUsername: EditText = findViewById(R.id.edit_username)
        val inputPassword: EditText = findViewById(R.id.edit_password)
        val loginButton: Button = findViewById(R.id.btn_login)
        val registerButton: Button = findViewById(R.id.btn_register)

        val validUsername:String = "temp"
        val validPassword:String = "temp"

        loginButton.setOnClickListener {
            if(inputUsername.text.toString() == validUsername && inputPassword.text.toString() == validPassword) {
                val intent = Intent(this@LoginActivity,DisplayDetails::class.java)
                intent.putExtra("inUsername",inputUsername.text.toString())
                intent.putExtra("inPassword",inputPassword.text.toString())
                intent.putExtra("inType","login")
                startActivity(intent)
            }

            else {
                Toast.makeText(
                    this@LoginActivity,
                    "Incorrect credentials",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        registerButton.setOnClickListener {
            val startRegister =Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(startRegister)
        }
    }
}