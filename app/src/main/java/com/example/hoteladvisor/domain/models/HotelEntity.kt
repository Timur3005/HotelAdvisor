package com.example.hoteladvisor.domain.models

data class HotelEntity(
    val id: Int,
    val name: String,
    val address: String,
    val minPrice: Int,
    val priceFor: String,
    val rating: Double,
    val ratingName: String,
    val hotelDescription: String,
    val peculiarities: List<String>,
    val images: List<String>
)
