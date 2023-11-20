package com.example.hoteladvisor.data

import com.example.hoteladvisor.data.mapper.Mapper
import com.example.hoteladvisor.data.remote.ApiService
import com.example.hoteladvisor.di.ApplicationScope
import com.example.hoteladvisor.domain.HotelRepository
import com.example.hoteladvisor.domain.models.HotelEntity
import com.example.hoteladvisor.domain.models.HotelRoomsEntity
import com.example.hoteladvisor.domain.models.ReservationEntity
import javax.inject.Inject

@ApplicationScope
class HotelRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val mapper: Mapper
): HotelRepository {
    override suspend fun getHotel(): HotelEntity {
        return mapper.mapHotelDtoToHotelEntity(apiService.getHotel())
    }

    override suspend fun getHotelRooms(): List<HotelRoomsEntity> {
        return apiService.getRooms().rooms?.map {
            mapper.mapHotelRoomsDtoToHotelRoomsEntity(it)
        } ?: throw RuntimeException("container is empty")
    }

    override suspend fun getReservation(): ReservationEntity {
        return mapper.mapReservationDtoToReservationEntity(apiService.getReservation())
    }
}