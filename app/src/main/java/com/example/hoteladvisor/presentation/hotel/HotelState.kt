package com.example.hoteladvisor.presentation.hotel

import com.example.hoteladvisor.domain.models.HotelEntity

sealed class HotelState
data object Loading: HotelState()
class ShowHotel(
    val hotelEntity: HotelEntity
): HotelState()