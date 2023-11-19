package com.example.hoteladvisor.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RoomsContainerDto(
    @SerializedName("rooms")
    @Expose
    val rooms: List<HotelRoomsDto>?
)
