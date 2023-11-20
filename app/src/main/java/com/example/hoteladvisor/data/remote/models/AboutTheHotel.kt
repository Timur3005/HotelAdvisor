package com.example.hoteladvisor.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AboutTheHotel(
    @SerializedName("description")
    @Expose
    val hotelDescription: String?,
    @SerializedName("peculiarities")
    @Expose
    val peculiarities: List<String>?
)
