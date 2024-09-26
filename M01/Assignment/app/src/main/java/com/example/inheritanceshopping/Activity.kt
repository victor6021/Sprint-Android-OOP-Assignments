package com.example.inheritanceshopping

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.inheritanceshopping.retrofit.PlaceHolderApi

open class Activity: AppCompatActivity() {
    lateinit var placeHolderApi: PlaceHolderApi

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        initializeApi()
    }

    open fun initializeApi() {
        placeHolderApi = PlaceHolderApi.Factory.create()
    }

    open fun onFailure(throwable: Throwable){

    }
}