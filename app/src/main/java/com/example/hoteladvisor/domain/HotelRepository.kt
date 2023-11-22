package com.example.hoteladvisor.domain

import com.example.hoteladvisor.domain.models.HotelEntity
import com.example.hoteladvisor.domain.models.HotelRoomEntity
import com.example.hoteladvisor.domain.models.ReservationEntity

interface HotelRepository {

    suspend fun getHotel(): HotelEntity
    suspend fun getHotelRooms(): List<HotelRoomEntity>
    suspend fun getReservation(): ReservationEntity
}