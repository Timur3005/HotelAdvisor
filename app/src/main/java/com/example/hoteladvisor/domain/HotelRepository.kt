package com.example.hoteladvisor.domain

import androidx.lifecycle.LiveData
import com.example.hoteladvisor.domain.models.HotelEntity
import com.example.hoteladvisor.domain.models.HotelRoomsEntity
import com.example.hoteladvisor.domain.models.ReservationEntity

interface HotelRepository {

    suspend fun getHotel(): LiveData<HotelEntity>
    suspend fun getHotelRooms(): LiveData<List<HotelRoomsEntity>>
    suspend fun getReservation(): LiveData<ReservationEntity>
}