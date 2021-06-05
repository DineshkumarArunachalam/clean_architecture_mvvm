package com.example.entiretutorial.di

import com.example.entiretutorial.service.ApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(
    SingletonComponent::class)
class Module {

    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl("https://reqres.in")
    .build()


    @Provides
    @Singleton

    fun provideApiInterface(retrofit: Retrofit):ApiInterface=retrofit.create(ApiInterface::class.java)

}