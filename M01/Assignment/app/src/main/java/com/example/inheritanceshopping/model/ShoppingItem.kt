package com.example.inheritanceshopping.model

import android.util.Log
import com.example.inheritanceshopping.R

open class ShoppingItem(val colorId: Int, val productName: String){
    val returnDisplayName = "$productName"
    open fun getDisplayName(): String{
        return "$returnDisplayName"
    }
}

class food(colorId: Int, productName: String):ShoppingItem(colorId, productName) {
    val foodColorId:Int = R.color.foodColor
    fun getFood(){
        Log.i("food","buying food")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nmust be refrigerated"
    }
}

class clothing(colorId: Int, productName: String):ShoppingItem(colorId, productName){
    val clothingColorId: Int = R.color.clothingColor
    fun getClothing(){
        Log.i("clothing","buying cloth")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nSize M"
    }
}

class electronic(colorId: Int, productName: String):ShoppingItem(colorId, productName){
    val electronicColorId: Int = R.color.electronicColor
    fun getElectronic(){
        Log.i("electronic","buying electronic")
    }

    override fun getDisplayName(): String {
        return "$returnDisplayName, \nNeed delivery"
    }
}