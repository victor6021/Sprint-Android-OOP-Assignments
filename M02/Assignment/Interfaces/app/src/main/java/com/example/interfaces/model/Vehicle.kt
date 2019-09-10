package com.example.interfaces.model

abstract class Vehicle(
    open val id: String,
    open val weight: Int,
    open val favorite: Boolean) {

    open fun fly():String{

    }

}