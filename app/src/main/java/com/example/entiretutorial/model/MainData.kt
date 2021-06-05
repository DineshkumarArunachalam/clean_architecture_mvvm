package com.example.entiretutorial.model

import com.google.gson.annotations.SerializedName

data class MainData (

    @SerializedName("page") var page : Int,
    @SerializedName("per_page") var perPage : Int,
    @SerializedName("total") var total : Int,
    @SerializedName("total_pages") var totalPages : Int,
    @SerializedName("data") var data : List<Data>,
    @SerializedName("support") var support : Support

)

data class Data (

    @SerializedName("id") var id : Int,
    @SerializedName("name") var name : String,
    @SerializedName("year") var year : Int,
    @SerializedName("color") var color : String,
    @SerializedName("pantone_value") var pantoneValue : String

)

data class Support (

    @SerializedName("url") var url : String,
    @SerializedName("text") var text : String

)