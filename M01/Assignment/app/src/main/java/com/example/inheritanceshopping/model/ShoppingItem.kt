package com.example.inheritanceshopping.model

open class ShoppingItem(val colorId: Int, val productName: String)

class getDisplayName(colorId: Int, productName: String): ShoppingItem(colorId, productName){
    open fun returnProductName():String{
        return "$productName"
    }
}