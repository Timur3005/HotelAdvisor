package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.domain.HotelRepository
import javax.inject.Inject

class GetHotelUseCase @Inject constructor(private val repository: HotelRepository) {
    operator fun invoke() = repository.getHotel()
}