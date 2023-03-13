package com.example.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editUsername:EditText
    private lateinit var editPassword:EditText
    lateinit var btnLogin:Button
    lateinit var sharedPreferences: SharedPreferences
    private val validMobileNumber = "9999999999"
    private val validPassword = "thanos"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(getString(R.string.SharedPreferencesAvengers),Context.MODE_PRIVATE)
        // false: Default value, if the constant "isLoggedIn" is not found in the SharedPreferences file.
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn",false)
        if(isLoggedIn) {
            val intent = Intent(this@MainActivity,ScrollViewActivity::class.java)
            startActivity(intent)
            intent.putExtra("Username","Thanos")
            finish()
        }
        // else display the login page
//        else {
//            setContentView(R.layout.avengers_login)
//        }

        setContentView(R.layout.avengers_login)
        editUsername = findViewById(R.id.editUsername)
        editPassword = findViewById(R.id.editPassword)
        btnLogin = findViewById(R.id.btnLogin)

        // Lambda representation of implementing setOnClickListener().
        btnLogin.setOnClickListener() {
            val inputMobile = editUsername.text.toString();
            val inputPassword = editPassword.text.toString();
            if((inputMobile == validMobileNumber) && (inputPassword == validPassword)) {
                val intent = Intent(this@MainActivity, ScrollViewActivity::class.java)
                /* Put some 'extra' stuff along with the intent.
                 * intent.putExtra(name,value)
                 * name: Name of the variable / constant to send.
                 * value: Value of the variable / constant.
                 */
                credentialsEntered()
                startActivity(intent)
            }
            else {
                // Showing a toast
                Toast.makeText(
                    this,
                    "Incorrect username / password.",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }

    override fun onPause() {
        super.onPause()
        // finish() - Destroy the activity onPause()
        finish()
    }

    fun credentialsEntered() {
        // Edit the file, i.e. add a boolean value true when the user has entered his credentials.
        // This signifies the app that the credentials have been saved.
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
        sharedPreferences.edit().putString("Username","Thanos").apply()
    }
}