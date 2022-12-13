package com.sayan.sharedpreferences

import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    //Defining here, because we need to be able to access them from other functions.
    //private lateinit var variable_name: data_type
    private lateinit var nameText: EditText
    private lateinit var ageText: EditText
    private lateinit var sf:SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameText = findViewById(R.id.editName)
        ageText = findViewById(R.id.editNumber)
        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
        editor = sf.edit()
    }

    override fun onPause()
    {
        super.onPause()
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        //Commit the changes (i.e. whatever the user inputs)
        editor.apply{
            putString("sf_name",name)
            putInt("sf_age",age)
            commit()
        }
    }

    override fun onResume()
    {
        super.onResume()
        val name = sf.getString("sf_name",null)
        val age = sf.getInt("sf_age",0)
        nameText.setText(name)
        if(age != 0)
        {
            ageText.setText(age.toString())
        }
    }
}