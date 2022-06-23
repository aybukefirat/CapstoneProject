package com.aybukefirat.capstoneproject.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CRUDResponse(

    @SerializedName("status") @Expose var status : Int,
    @SerializedName ("status") @Expose var message : String,

)
