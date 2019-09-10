package com.example.interfaces

import com.example.interfaces.model.*


object VehicleList{
    const val ID = "id"
    const val WEIGHT = "weight"

    val vehicle = arrayListOf(
            Bus(
                id = "Travel Bus",
                weight = 54000
            ),
            Taxi(
                id = "TaxiCab",
                weight = 4354
            ),
            Ship(
                id = "Cruise",
                weight = 311746000
            ),
            Boat(
                id = "Speed Boat",
                weight = 8000
            ),
            Airplane(
                id = "Plane",
                weight = 175000
            ),
            Helicopter(
                id = "Helicopter",
                weight = 2500
            )



    )
}