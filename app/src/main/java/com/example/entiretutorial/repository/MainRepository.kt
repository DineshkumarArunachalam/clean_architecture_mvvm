package com.example.entiretutorial.repository

import com.example.entiretutorial.model.MainData
import com.example.entiretutorial.service.ApiInterface
import com.example.entiretutorial.util.SearchResult
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiInterface: ApiInterface) {


    suspend fun doImageSearch():MainData{
        return apiInterface.searchPhotos()
    }
}