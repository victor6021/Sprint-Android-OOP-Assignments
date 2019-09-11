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
        val female = peopleList(1)
    }
}
