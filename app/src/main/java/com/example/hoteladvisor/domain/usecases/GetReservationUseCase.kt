package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.di.ApplicationScope
import com.example.hoteladvisor.domain.HotelRepository
import javax.inject.Inject

@ApplicationScope
class GetReservationUseCase @Inject constructor(private val repository: HotelRepository) {
    suspend operator fun invoke() = repository.getReservation()
}