package com.example.domain

data class HotelEntity(
    val id: Int,
    val name: String,
    val address: String,
    val minPrice: Int,
    val hotelDescription: String,
    val peculiarities: List<String>,
    val images: List<String>
)
