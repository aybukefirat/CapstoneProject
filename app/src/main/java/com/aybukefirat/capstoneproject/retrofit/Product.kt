package com.aybukefirat.capstoneproject.retrofit

import com.google.gson.annotations.SerializedName

data class Product (

    @SerializedName("title") var productTitle : String,
    @SerializedName ("price") var productPrice : Double,
    @SerializedName ("description") var productDescript : String,
    @SerializedName ("category") var category : String,
    @SerializedName ("image") var image : String,
    @SerializedName ("count") var count : Int,
    @SerializedName ("rate") var rate : Double,
    @SerializedName ("sale_state") var saleState : Int,
)
