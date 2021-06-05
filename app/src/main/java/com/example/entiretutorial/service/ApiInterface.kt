package com.example.entiretutorial.service

import com.example.entiretutorial.BuildConfig
import com.example.entiretutorial.model.MainData
import com.example.entiretutorial.util.SearchResult
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiInterface {
    companion object {
        const val BASE_URL = "https://api.unsplash.com/"

    }
    @GET("/api/unknown")
  suspend fun searchPhotos(): MainData
}