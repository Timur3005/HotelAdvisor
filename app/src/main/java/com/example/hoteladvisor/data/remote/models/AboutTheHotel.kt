package com.example.hoteladvisor.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AboutTheHotel(
    @SerializedName("id")
    @Expose
    val hotelDescription: String?,
    @SerializedName("id")
    @Expose
    val peculiarities: List<String>?
)
