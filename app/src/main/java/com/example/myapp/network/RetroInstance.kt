package com.example.myapp.network

import com.example.myapp.models.RecyclerList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class RetroInstance {

    companion object{
        val BaseURL ="https://retoolapi.dev/JJfCqp/data"
        fun getRetroInstance(): Retrofit {
            return  Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}