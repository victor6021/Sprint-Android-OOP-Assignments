package com.example.inheritanceshopping.model

import android.util.Log

open class ShoppingItem(val productName: String,val colorId: Int){
    val returnDisplayName = "$productName"
    open fun getDisplayName(): String{
        return "$returnDisplayName"
    }
}

class food(colorId: Int, productName: String):ShoppingItem(productName, colorId) {
    fun getFood(){
        Log.i("food","buying food")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nMust be refrigerated"
    }
}

class clothing(colorId: Int, productName: String):ShoppingItem(productName, colorId){
    fun getClothing(){
        Log.i("clothing","buying cloth")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nSize M"
    }
}

class electronic(colorId: Int, productName: String):ShoppingItem(productName, colorId){
    fun getElectronic(){
        Log.i("electronic","buying electronic")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nNeed delivery"
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