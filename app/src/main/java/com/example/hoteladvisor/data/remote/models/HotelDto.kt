package com.example.hoteladvisor.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class HotelDto(
    @SerializedName("id")
    @Expose
    val id: Int?,
    @SerializedName("name")
    @Expose
    val name: String?,
    @SerializedName("adress")
    @Expose
    val adress: String?,
    @SerializedName("minimal_price")
    @Expose
    val minPrice: Int?,
    @SerializedName("price_for_it")
    @Expose
    val priceFor: String?,
    @SerializedName("rating")
    @Expose
    val rating: Int?,
    @SerializedName("rating_name")
    @Expose
    val ratingName: String?,
    @SerializedName("image_urls")
    @Expose
    val images: List<String>?,
    @SerializedName("about_the_hotel")
    @Expose
    val aboutTheHotel: AboutTheHotel?
)
