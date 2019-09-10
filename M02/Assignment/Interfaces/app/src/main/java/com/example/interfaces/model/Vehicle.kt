package com.example.interfaces.model

abstract class Vehicle(
    open val id: String,
    open val weight: Int,
    open val favorite: Boolean): AirTravel, WaterTravel, GroundTravel {

    open fun travel():String{
        return "$id,$weight"
    }

}

abstract class bus(id: String, weight: Int, favorite: Boolean):Vehicle(id,weight,favorite){
    override fun travel(): String {
        return "$id travels via ${drive()}"
    }
}

abstract class taxi(id: String, weight: Int, favorite: Boolean):Vehicle(id,weight,favorite){
    override fun travel(): String {
        return "$id travels via ${drive()}"
    }
}

abstract class ship(id: String, weight: Int, favorite: Boolean):Vehicle(id,weight,favorite){
    override fun travel(): String {
        return "$id travels via ${sail()}"
    }
}

abstract class boat(id: String, weight: Int, favorite: Boolean):Vehicle(id,weight,favorite){
    override fun travel(): String {
        return "$id travels via ${sail()}"
    }
}

abstract class airplane(id: String, weight: Int, favorite: Boolean):Vehicle(id,weight,favorite){
    override fun travel(): String {
        return "$id travels via ${fly()}"
    }
}

abstract class helicopter(id: String, weight: Int, favorite: Boolean):Vehicle(id,weight,favorite){
    override fun travel(): String {
        return "$id travels via ${fly()}"
    }
}