package com.example.hoteladvisor.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hoteladvisor.data.mapper.Mapper
import com.example.hoteladvisor.data.remote.ApiService
import com.example.hoteladvisor.domain.HotelRepository
import com.example.hoteladvisor.domain.models.HotelEntity
import com.example.hoteladvisor.domain.models.HotelRoomsEntity
import com.example.hoteladvisor.domain.models.ReservationEntity
import javax.inject.Inject

class HotelRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val mapper: Mapper
): HotelRepository {
    override suspend fun getHotel(): LiveData<HotelEntity> {
        return MutableLiveData(
            mapper.mapHotelDtoToHotelEntity(apiService.getHotel())
        )
    }

    override suspend fun getHotelRooms(): LiveData<List<HotelRoomsEntity>> {
        TODO("Not yet implemented")
    }

    override suspend fun getReservation(): LiveData<ReservationEntity> {
        TODO("Not yet implemented")
    }
}