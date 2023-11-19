package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.domain.HotelRepository
import javax.inject.Inject

class GetReservationUseCase @Inject constructor(private val repository: HotelRepository) {
    operator fun invoke() = repository.getReservation()
}