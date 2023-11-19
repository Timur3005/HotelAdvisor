package com.example.hoteladvisor.data

import androidx.lifecycle.LiveData
import com.example.hoteladvisor.domain.HotelRepository
import com.example.hoteladvisor.domain.models.HotelEntity
import com.example.hoteladvisor.domain.models.HotelRoomsEntity
import com.example.hoteladvisor.domain.models.ReservationEntity
import javax.inject.Inject

class HotelRepositoryImpl @Inject constructor(

): HotelRepository {
    override fun getHotel(): LiveData<HotelEntity> {
        TODO("Not yet implemented")
    }

    override fun getHotelRooms(): LiveData<List<HotelRoomsEntity>> {
        TODO("Not yet implemented")
    }

    override fun getReservation(): LiveData<ReservationEntity> {
        TODO("Not yet implemented")
    }
}