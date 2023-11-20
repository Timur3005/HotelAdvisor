package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.domain.HotelRepository
import javax.inject.Inject

class GetReservationUseCase @Inject constructor(private val repository: HotelRepository) {
    suspend operator fun invoke() = repository.getReservation()
}