package com.example.hoteladvisor.presentation.hotelrooms

import androidx.recyclerview.widget.DiffUtil
import com.example.hoteladvisor.domain.models.HotelRoomEntity

object HotelRoomCallback: DiffUtil.ItemCallback<HotelRoomEntity>() {
    override fun areItemsTheSame(oldItem: HotelRoomEntity, newItem: HotelRoomEntity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: HotelRoomEntity, newItem: HotelRoomEntity): Boolean {
        return oldItem == newItem
    }

}