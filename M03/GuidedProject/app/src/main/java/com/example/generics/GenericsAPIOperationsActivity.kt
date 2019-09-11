package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class GenericsAPIOperationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generics_apioperations)
    }

    override fun onStart() {
        super.onStart()
        //import reactivex for observable
        val observable = Observable.just("Alpha","Beta","Gamma","Delta")

        observable.subscribe(){item -> println("The observable returned $item")}

        val personObservable = Observable.just(Mark(),Alan())

        personObservable.subscribe(){person -> println("The observable returned $person")}
    }

    open class Person
    class Mark: Person()
    class Alan: Person()

    class NetworkAPI{
        companion object{

            fun getListOfPeople(): Observable<List<Person>>{
                return Observable.just(listOf(Mark(),Alan()))
            }
        }
    }
}
