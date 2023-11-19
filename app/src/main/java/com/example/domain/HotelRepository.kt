package com.example.domain

import androidx.lifecycle.LiveData
import com.example.domain.models.HotelEntity
import com.example.domain.models.HotelRoomsEntity
import com.example.domain.models.ReservationEntity

interface HotelRepository {

    fun getHotel(): LiveData<HotelEntity>
    fun getHotelRooms(): LiveData<List<HotelRoomsEntity>>
    fun getReservation(): LiveData<ReservationEntity>
}