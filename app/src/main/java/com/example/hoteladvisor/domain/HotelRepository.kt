package com.example.hoteladvisor.domain

import androidx.lifecycle.LiveData
import com.example.hoteladvisor.domain.models.HotelEntity
import com.example.hoteladvisor.domain.models.HotelRoomsEntity
import com.example.hoteladvisor.domain.models.ReservationEntity

interface HotelRepository {

    fun getHotel(): LiveData<HotelEntity>
    fun getHotelRooms(): LiveData<List<HotelRoomsEntity>>
    fun getReservation(): LiveData<ReservationEntity>
}