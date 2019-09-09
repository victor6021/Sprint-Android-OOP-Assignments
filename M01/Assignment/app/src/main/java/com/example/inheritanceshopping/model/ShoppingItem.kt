package com.example.inheritanceshopping.model

import android.util.Log

open class ShoppingItem(val colorId: Int, val productName: String){
    val returnDisplayName = "$productName"
    open fun getDisplayName(): String{
        return "$returnDisplayName, \n" +
                "Color ID = $colorId"
    }
}

class food(colorId: Int, productName: String):ShoppingItem(colorId, productName) {
    fun getFood(){
        Log.i("food","buying food")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nmust be refrigerated, \n" +
                "Color ID = $colorId"
    }
}

class clothing(colorId: Int, productName: String):ShoppingItem(colorId, productName){
    fun getClothing(){
        Log.i("clothing","buying cloth")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nSize M, \n" +
                "Color ID = $colorId"
    }
}

class electronic(colorId: Int, productName: String):ShoppingItem(colorId, productName){
    fun getElectronic(){
        Log.i("electronic","buying electronic")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nNeed delivery, \n" +
                "Color ID = $colorId"
    }
}

object shoppingData: ArrayList<ShoppingItem>(
    arrayListOf(
        food(
            productName = "Banana",
            colorId = 1
        ),
        food(
            productName = "Apple",
            colorId = 1
        ),
        clothing(
            productName = "T-Shirt",
            colorId = 2
        ),
        clothing(
            productName = "Jean",
            colorId = 2
        ),
        electronic(
            productName = "Television",
            colorId = 3
        ),
        electronic(
            productName = "Computer",
            colorId = 3
        )
    )
)