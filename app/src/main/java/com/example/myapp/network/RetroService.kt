package com.example.myapp.network

import com.example.myapp.models.RecyclerList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {
    @GET("JJfCqp/data")
    suspend fun getDataFromApi(@Query("q") query: String): RecyclerList
}