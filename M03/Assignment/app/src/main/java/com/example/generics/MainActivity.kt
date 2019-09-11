package com.example.generics

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = mutableListOf("Tom", "Jerry", "May","John")
        person.add(1.toString())
    }
}
