package com.example.domain

data class HotelRoomsEntity(
    val id: Int,
    val name: String,
    val price: Int,
    val pricePer: String,
    val peculiarities: List<String>,
    val images: List<String>
)
