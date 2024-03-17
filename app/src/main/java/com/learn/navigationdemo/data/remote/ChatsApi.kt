package com.learn.navigationdemo.data.remote

import com.learn.navigationdemo.domain.model.ChatsModel
import retrofit2.http.GET

interface ChatsApi {
    @GET("/karun02525/API/main/whatapp.json")
    suspend fun getChats():List<ChatsModel>

    companion object{
        const val BASE_URL="https://raw.githubusercontent.com"
    }
}