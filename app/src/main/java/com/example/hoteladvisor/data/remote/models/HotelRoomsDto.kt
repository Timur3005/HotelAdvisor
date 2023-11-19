package com.example.hoteladvisor.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class HotelRoomsDto(
    @SerializedName("id")
    @Expose
    val id: Int?,
    @SerializedName("name")
    @Expose
    val name: String?,
    @SerializedName("price")
    @Expose
    val price: Int?,
    @SerializedName("price_per")
    @Expose
    val pricePer: String?,
    @SerializedName("peculiarities")
    @Expose
    val peculiarities: List<String>?,
    @SerializedName("image_urls")
    @Expose
    val images: List<String>?
)
