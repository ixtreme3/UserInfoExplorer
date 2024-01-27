package com.example.userinfoexplorer.network

import com.example.userinfoexplorer.network.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserApi {
    @GET("api")
    suspend fun getUserList(
        @Query("page") page: Int,
        @Query("results") results: Int,
        @Query("seed") seed: String,
    ): UserResponse
}