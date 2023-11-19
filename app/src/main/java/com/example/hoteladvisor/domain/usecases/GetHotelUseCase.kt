package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.domain.HotelRepository

class GetHotelUseCase(private val repository: HotelRepository) {
    operator fun invoke() = repository.getHotel()
}