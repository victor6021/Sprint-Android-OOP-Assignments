package com.example.inheritanceshopping.retrofit

import com.example.inheritanceshopping.model.*
import com.squareup.moshi.FromJson

class ShoppingTypeAdapter {
    @FromJson
    fun shoppingFromJson(shoppingJson: ShoppingJson): ShoppingItem{

        return when(shoppingJson.productName){
            "Banana" -> food(shoppingJson.productName,shoppingJson.colorId)
            "Apple" -> food(shoppingJson.productName,shoppingJson.colorId)
            "T-shirt" -> clothing(shoppingJson.productName,shoppingJson.colorId)
            "Jean" -> clothing(shoppingJson.productName,shoppingJson.colorId)
            "Television" -> electronic(shoppingJson.productName,shoppingJson.colorId)
            "Computer" -> electronic(shoppingJson.productName,shoppingJson.colorId)
            else -> ShoppingItem(shoppingJson.productName,shoppingJson.colorId)
        }
    }
}