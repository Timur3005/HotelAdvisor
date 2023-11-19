package com.example.domain.usecases

import com.example.domain.HotelRepository

class GetHotelRoomsUseCase(private val repository: HotelRepository) {
    operator fun invoke() = repository.getHotelRooms()
}