package com.sayan.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val user = intent.getStringExtra("USER")
        val title = findViewById<TextView>(R.id.txt2ndtitle)
        var msg = "Hey $user!\n Here's some offers for you!"
        title.text = msg
    }
}