package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class GenericFunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic_functions)

    }

    override fun onStart(){
        super.onStart()
//        val mySingleList = singleList("a")
//        val myOtherSingleList = singleList(1)
//        Toast.makeText(this,"Our first list contains ${mySingleList[0]}\n" +
//                "Our second list contains ${myOtherSingleList[0]}", Toast.LENGTH_SHORT).show()

        val intBox = Box(1)
    }

    fun <T,V> singleList(t: T, v: V): Map<T, V>{
        val theList = mutableMapOf<T,V>()
        theList[t] = v
        return theList
    }
    class Ball

    class Box<T>(private var item: T){

        var open = false
//        private var item: T = item

        fun fetch(): T?{
            return item.takeIf { open }
        }
    }


}
