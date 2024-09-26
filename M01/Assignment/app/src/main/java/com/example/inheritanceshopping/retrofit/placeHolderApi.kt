package com.example.inheritanceshopping.retrofit

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

interface PlaceHolderApi {

    class Factory {

        companion object {

            fun create(): PlaceHolderApi {

                val logger = HttpLoggingInterceptor()
                logger.level = HttpLoggingInterceptor.Level.BASIC
                logger.level = HttpLoggingInterceptor.Level.BODY

                val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor(logger)
                    .retryOnConnectionFailure(false)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .build()

                val moshi = Moshi.Builder()
                    .add(ShoppingTypeAdapter())
                    .build()

                val retrofit = Retrofit.Builder()
                    .client(okHttpClient)
                    .addConverterFactory(MoshiConverterFactory.create(moshi))
                    .build()

                return retrofit.create(PlaceHolderApi::class.java)
            }
        }
    }
}