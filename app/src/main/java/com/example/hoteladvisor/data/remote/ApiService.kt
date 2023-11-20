package com.example.hoteladvisor.data.remote

import com.example.hoteladvisor.data.remote.models.HotelDto
import com.example.hoteladvisor.data.remote.models.ReservationDto
import com.example.hoteladvisor.data.remote.models.RoomsContainerDto
import retrofit2.http.GET

interface ApiService {

    @GET("d144777c-a67f-4e35-867a-cacc3b827473")
    suspend fun getHotel(): HotelDto

    @GET("8b532701-709e-4194-a41c-1a903af00195")
    suspend fun getRooms(): RoomsContainerDto

    @GET("63866c74-d593-432c-af8e-f279d1a8d2ff")
    suspend fun getReservation(): ReservationDto
}