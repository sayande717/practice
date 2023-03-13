package com.example.a2_module3project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display_details)

        val output1:TextView = findViewById(R.id.txtOut1)
        val output2:TextView = findViewById(R.id.txtOut2)

        val inType = intent.getStringExtra("inType")

        if(inType == "login") {
            val username = intent.getStringExtra("inUsername")
            val password = intent.getStringExtra("inPassword")
            output1.text = "Username: $username"
            output2.text = "Password: $password"
        }

        else {
            output1.text = "no input"
        }

    }
}