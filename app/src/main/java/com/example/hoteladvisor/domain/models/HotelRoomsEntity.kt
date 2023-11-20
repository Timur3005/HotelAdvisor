package com.example.hoteladvisor.domain.models

data class HotelRoomsEntity(
    val id: Int?,
    val name: String?,
    val price: Int?,
    val pricePer: String?,
    val peculiarities: List<String>?,
    val images: List<String>?
)
