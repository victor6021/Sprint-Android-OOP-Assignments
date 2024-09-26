package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

    class Box<M>(private var movie:M): Callback<DummyNetworkAPI>{
        override fun onFailure(call: Call<DummyNetworkAPI>, t: Throwable) {

        }

        override fun onResponse(call: Call<DummyNetworkAPI>, response: Response<DummyNetworkAPI>) {

        }

        var open = false

        fun fetch():M?{
            println("movieCall1")
            println("movieCall2")
            println("movieCall3")
            println("movieCall4")
            return movie.takeIf { open }
        }
    }
}

