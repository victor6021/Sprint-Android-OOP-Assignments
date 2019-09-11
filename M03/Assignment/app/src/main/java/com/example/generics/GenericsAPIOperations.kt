package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class GenericsAPIOperations : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generics_apioperations)
    }

    override fun onStart() {
        super.onStart()

        val observable = Observable.just(1,2,3)

        observable.subscribe(){int -> println("This observable returned $int")}

        val personObservable = Observable.just(TomCruise(),BradPitt())

        personObservable.subscribe(){person -> println("This observable returned $person")}
    }

    open class Person
    class TomCruise: Person()
    class BradPitt: Person()
}
