package com.aybukefirat.capstoneproject.retrofit

import com.google.gson.annotations.SerializedName

data class Bag(
    @SerializedName ("title") var title : String,
    @SerializedName ("price") var price : Double,
    @SerializedName ("description") var description : String,
    @SerializedName ("category") var category : String,
    @SerializedName ("image") var image : String,
    @SerializedName ("rate") var rate : Double,
    @SerializedName ("count") var count : Int,
    @SerializedName ("sale_state") var saleState : Int,

)  //:CRUDResponse
