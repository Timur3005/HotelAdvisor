package com.example.domain.models

data class ReservationEntity(
    val id: Int,
    val hotelName: String,
    val hotelAddress: String,
    val hotelRating: String,
    val ratingName: String,
    val departure: String,
    val arrivalCountry: String,
    val tourDateStart: String,
    val tourDateStop: String,
    val numberOfNights: Int,
    val roomDescription: String,
    val nutrition: String,
    val tourPrice: Int,
    val fuelCharge: Int,
    val serviceCharge: Int
)
