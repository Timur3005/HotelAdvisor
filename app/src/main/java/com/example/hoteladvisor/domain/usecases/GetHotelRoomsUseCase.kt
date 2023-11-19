package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.domain.HotelRepository

class GetHotelRoomsUseCase(private val repository: HotelRepository) {
    operator fun invoke() = repository.getHotelRooms()
}