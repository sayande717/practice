package com.example.a2_module3project

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val imgSplash:ImageView = findViewById(R.id.img_splash)
        imgSplash.setOnClickListener {
            val startLogin = Intent(this@MainActivity,LoginActivity::class.java)
            Toast.makeText(
                this@MainActivity,
                "Welcome!",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(startLogin)
        }
    }
}