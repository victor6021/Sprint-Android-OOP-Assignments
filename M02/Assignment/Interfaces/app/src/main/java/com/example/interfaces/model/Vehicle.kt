package com.example.interfaces.model

import java.io.Serializable

abstract class Vehicle(
    open val id: String? = null,
    open val weight: Int? = null,
    open val favorite: Boolean = false):Serializable {

    open fun travel():String = " Vehicle"

    override fun toString(): String {
        return "Vehicle(id = $id, weight = $weight"
    }

}

data class Bus(override val id: String, override val weight: Int):Vehicle(){
    private fun drive() {

    }

    override fun travel(): String {
        return "$id travels via ${drive()}"
    }
}

class Taxi(override val id: String, override val weight: Int):Vehicle(){
    private fun drive(){

    }
    override fun travel(): String {
        return "$id travels via ${drive()}"
    }
}

class Ship(override val id: String, override val weight: Int):Vehicle(){
    private fun sail(){

    }
    override fun travel(): String {
        return "$id travels via ${sail()}"
    }
}

class Boat(override val id: String, override val weight: Int):Vehicle(){
    private fun sail(){

    }
    override fun travel(): String {
        return "$id travels via ${sail()}"
    }
}

class Airplane(override val id: String, override val weight: Int):Vehicle(){
    private fun fly(){

    }
    override fun travel(): String {
        return "$id travels via ${fly()}"
    }
}

class Helicopter(override val id: String, override val weight: Int):Vehicle(){
    private fun fly(){

    }
    override fun travel(): String {
        return "$id travels via ${fly()}"
    }
}