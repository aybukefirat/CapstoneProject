package com.aybukefirat.capstoneproject.retrofit

import com.aybukefirat.capstoneproject.entity.CRUDResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface BagAPIService {
    @GET("get_products.php")
    fun getProducts(): Call<List<Product>>

    @POST("add_to_bag.php")
    @FormUrlEncoded
    fun addToBag(
        @Field("user") user: String,
        @Field("title") title: String,
        @Field(" price") price: Double,
        @Field("description") description: String,
        @Field(" category") category: String,
        @Field("image") image: String,
        @Field(" rate") rate: Double,
        @Field("count") count: Int,
        @Field(" sale_state") sale_state: Int,
    ) : CRUDResponse

    @POST("get_bag_products_by_user.php")
    @FormUrlEncoded
    fun getBagProductsByUser(@Field("user") user: String
    ): List<Product>

    @POST("delete_to_bag.php")
    @FormUrlEncoded
    fun deleteFromBag(@Field("id") id : Int) : CRUDResponse


}

