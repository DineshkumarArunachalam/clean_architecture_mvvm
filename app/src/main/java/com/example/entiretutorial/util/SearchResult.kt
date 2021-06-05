package com.example.entiretutorial.util

sealed class SearchResult<T>(val data:T?=null, val error:T?=null) {

    class Success<T>(val dataValue: T?): SearchResult<T>(dataValue)
    class Failure<T>(val errorMessage: T?): SearchResult<T>(errorMessage)
}