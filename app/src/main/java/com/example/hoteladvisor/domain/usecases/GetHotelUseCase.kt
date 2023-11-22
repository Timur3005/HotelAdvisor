package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.di.ApplicationScope
import com.example.hoteladvisor.domain.HotelRepository
import com.example.hoteladvisor.domain.models.HotelEntity
import javax.inject.Inject

@ApplicationScope
class GetHotelUseCase @Inject constructor(
    private val repository: HotelRepository
) {
    suspend operator fun invoke(): HotelEntity = repository.getHotel()
}