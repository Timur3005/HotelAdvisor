package com.example.domain.usecases

import com.example.domain.HotelRepository

class GetHotelUseCase(private val repository: HotelRepository) {
    operator fun invoke() = repository.getHotel()
}