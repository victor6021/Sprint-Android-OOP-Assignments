package com.example.generics

import com.example.generics.model.Movie
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DummyNetworkAPI {

    fun getMovie(id: Int): Call<Movie> {
        return movieCall1
    }
    fun getMovie2(id: Int): Call<Movie> {
        return movieCall2
    }
    fun getMovie3(id: Int): Call<Movie> {
        return movieCall3
    }
    fun getMovie4(id: Int): Call<Movie> {
        return movieCall4
    }
}
val avengers = Movie(
    yearOfRelease = 2019,
    title = "Avengers",
    language = "English",
    imdbRating = 5
)
val starWars = Movie(
    yearOfRelease = 2019,
    title = "Star Wars",
    language = "English",
    imdbRating = 5
)
val mib = Movie(
    yearOfRelease = 2019,
    title = "Men in Black",
    language = "English",
    imdbRating = 4
)
val fastAndFurious = Movie(
    yearOfRelease = 2018,
    title = "Fast and Furious",
    language = "English",
    imdbRating = 5
)

val movieCall1 = object: Call<Movie>{
    override fun enqueue(callback: Callback<Movie>) {
        val response = Response.success(avengers)
        callback.onResponse(this, response)
    }

    override fun isExecuted(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clone(): Call<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isCanceled(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cancel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun execute(): Response<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun request(): Request {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

val movieCall2 = object: Call<Movie>{
    override fun enqueue(callback: Callback<Movie>) {
        val response = Response.success(starWars)
        callback.onResponse(this, response)
    }

    override fun isExecuted(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clone(): Call<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isCanceled(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cancel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun execute(): Response<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun request(): Request {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
val movieCall3 = object: Call<Movie>{
    override fun enqueue(callback: Callback<Movie>) {
        val response = Response.success(mib)
        callback.onResponse(this, response)
    }

    override fun isExecuted(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clone(): Call<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isCanceled(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cancel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun execute(): Response<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun request(): Request {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

val movieCall4 = object: Call<Movie>{
    override fun enqueue(callback: Callback<Movie>) {
        val response = Response.success(fastAndFurious)
        callback.onResponse(this, response)
    }

    override fun isExecuted(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clone(): Call<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isCanceled(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cancel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun execute(): Response<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun request(): Request {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}