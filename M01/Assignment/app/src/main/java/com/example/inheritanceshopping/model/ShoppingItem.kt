package com.example.inheritanceshopping.model

open class ShoppingItem(val colorId: Int, val productName: String){
    val returnDisplayName = "$productName"
    open fun getDisplayName(): String{
        return "$returnDisplayName"
    }
}

class food(colorId: Int, productName: String):ShoppingItem(colorId, productName){
    val colorId:Int = $(".color")

class clothing(colorId: Int, productName: String):ShoppingItem(colorId, productName){

}

class electronic(colorId: Int, productName: String):ShoppingItem(colorId, productName){

}