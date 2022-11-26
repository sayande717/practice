package com.sayan.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
         * val = read-only value
         * findViewById = Find the UI element by ID
         * TextView, EditText, Button, etc. = Element Type
         * R.id.<id> = This is how you link the element with the static variable.
         */
        val greetingTextView = findViewById<TextView>(R.id.textView)
        val inputfield = findViewById<EditText>(R.id.username)
        val submitbutton = findViewById<Button>(R.id.btnsubmit)
        val offersbutton = findViewById<Button>(R.id.btnoffers)
        var enteredName = ""
        /*
         * setOnClickListener() = Do { these things } after the 'submitbutton' ie the submit button, is invoked.
         * inputfield.text = Here, text is a class that contains a lot of methods, for ex. clear().
         * inputfield.text.toString() = Convert the text received in the input field, to String.
         */
        submitbutton.setOnClickListener()
        {
            enteredName = inputfield.text.toString()
            if (enteredName == "")
            {
                //Make the offers button invisible.
                offersbutton.visibility = INVISIBLE
                greetingTextView.text = ""
                /* Toast.makeText().show() = Display a toast message.
                 * makeText() = This method contains 3 parameters:
                 * context = Application (applicationContext) / Activity context (this@MainActivity)
                 * Application context = Tied to the lifecycle of the application
                 * Activity context = Tied to the lifecycle of the activity
                 * message = The message to be displayed
                 * duration = SHORT (Toast.LENGTH_SHORT) or LONG (Toast.LENGTH_LONG)
                 */
                Toast.makeText(
                    this@MainActivity,
                    "Please enter a name",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else
            {
                // $enteredName = In Kotlin, all variables are referred to by $ sign, ex. $var
                val msg = "Welcome, $enteredName!"
                greetingTextView.text = msg
                inputfield.text.clear()
                //Make the offers button visible.
                offersbutton.visibility = VISIBLE
            }
        }
        offersbutton.setOnClickListener()
        {
            /*
             * intent = the object of class Intent.
             * this = The package context.
             * second_activity::class.java - the 2nd file ie screen
             */
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }
    }
}