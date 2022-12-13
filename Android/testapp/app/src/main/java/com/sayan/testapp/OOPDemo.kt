package com.sayan.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OOPDemo : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oopdemo)
        //Creating an object (i.e. an instance) of the class Car.
        val car = Car()
        car.start()
        Log.i("CARTAG",car.driver("Name Title"))
    }
}