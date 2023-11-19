package com.example.domain.usecases

import com.example.domain.HotelRepository

class GetReservationUseCase(private val repository: HotelRepository) {
    operator fun invoke() = repository.getReservation()
}