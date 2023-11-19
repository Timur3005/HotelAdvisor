package com.example.hoteladvisor.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ReservationDto(
    @SerializedName("id")
    @Expose
    val id: Int?,
    @SerializedName("hotel_name")
    @Expose
    val hotelName: String?,
    @SerializedName("hotel_adress")
    @Expose
    val hotelAddress: String?,
    @SerializedName("horating")
    @Expose
    val hotelRating: Int?,
    @SerializedName("rating_name")
    @Expose
    val ratingName: String?,
    @SerializedName("departure")
    @Expose
    val departure: String?,
    @SerializedName("arrival_country")
    @Expose
    val arrivalCountry: String?,
    @SerializedName("tour_date_start")
    @Expose
    val tourDateStart: String?,
    @SerializedName("tour_date_stop")
    @Expose
    val tourDateStop: String?,
    @SerializedName("number_of_nights")
    @Expose
    val numberOfNights: Int?,
    @SerializedName("room")
    @Expose
    val roomDescription: String?,
    @SerializedName("nutrition")
    @Expose
    val nutrition: String?,
    @SerializedName("tour_price")
    @Expose
    val tourPrice: Int?,
    @SerializedName("fuel_charge")
    @Expose
    val fuelCharge: Int?,
    @SerializedName("service_charge")
    @Expose
    val serviceCharge: Int?
)
