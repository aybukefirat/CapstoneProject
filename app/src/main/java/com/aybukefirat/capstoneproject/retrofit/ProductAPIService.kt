package com.aybukefirat.capstoneproject.retrofit

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import java.util.*

interface ProductAPIService {
    @GET("get_products.php")
     fun getProducts(): Call<List<Product>>

    @POST("get_products_by_user.php")
    @FormUrlEncoded
    fun getProductsByUser(
        @Field("user") user: String,
    ): Call<List<Product>>

    @POST("get_products_by_category.php")
    @FormUrlEncoded
    fun getProductsByCategory(
        @Field("category") category: String,
    ): Call<List<Product>>

    @GET("get_categories.php")
    fun getCategories(): Call<List<String>>

    @POST ("get_product_by_id.php")
    @FormUrlEncoded fun getProductById (
        @Field("id") id : Int,) : Call<List<Product>>


}