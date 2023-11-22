package com.example.hoteladvisor.domain.usecases

import com.example.hoteladvisor.di.ApplicationScope
import com.example.hoteladvisor.domain.HotelRepository
import javax.inject.Inject

@ApplicationScope
class GetHotelRoomsUseCase @Inject constructor(
    private val repository: HotelRepository
) {
    suspend operator fun invoke() = repository.getHotelRooms()
}