package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.domain.HotelRepository

class GetReservationUseCase(private val repository: HotelRepository) {
    operator fun invoke() = repository.getReservation()
}