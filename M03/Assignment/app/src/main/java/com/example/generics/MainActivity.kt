package com.example.generics

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personList = mutableListOf("Tom", "Jerry", "May","John")
        personList.add(1.toString())

        class People<P>{

            private var people:P? = null
            fun get():P?{
                return people
            }

            fun put(p:P){
                people = p
            }
        }
    }

    fun <P> peopleList(p:P): List<P>{
        val theList = mutableListOf<P>()
        theList.add(p)
        return theList
    }

    override fun onStart(){
        super.onStart()
        val male = peopleList("Tom")
        val number = peopleList(1)
        Toast.makeText(this,"$male, is number $number",Toast.LENGTH_SHORT).show()
    }
    
}

