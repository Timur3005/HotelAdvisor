package com.example.hoteladvisor.presentation.hotelrooms

import com.example.hoteladvisor.domain.models.HotelRoomEntity

sealed class HotelRoomsState
data object Loading: HotelRoomsState()
class ShowRooms(
    val rooms: List<HotelRoomEntity>
): HotelRoomsState()