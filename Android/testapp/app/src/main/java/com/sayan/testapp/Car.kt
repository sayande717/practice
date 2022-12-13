package com.sayan.testapp
import android.util.Log

public class Car {
    fun start() {
        Log.i("CARTAG", "Car started...")
    }
    fun driver(name: String) : String
    {
        var driverName = name;
        return driverName;
    }
}