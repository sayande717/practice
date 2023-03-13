package com.example.activitylifecycle

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ScrollViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)
        var titleName: String? = ""
        lateinit var sharedPreferences: SharedPreferences
        if (intent != null) {
            // Get the intent from MainActivity.kt
            // Intent.get<Data Type>Extra(name)
//            titleName = intent.getStringExtra("Username")
            sharedPreferences = getSharedPreferences(getString(R.string.SharedPreferencesAvengers),
                MODE_PRIVATE)
            titleName = sharedPreferences.getString("Username","")

        }
        // Display the username as a toast message
        Toast.makeText(
            this,
            "Logged in as $titleName!",
            Toast.LENGTH_SHORT
        ).show()
    }
}