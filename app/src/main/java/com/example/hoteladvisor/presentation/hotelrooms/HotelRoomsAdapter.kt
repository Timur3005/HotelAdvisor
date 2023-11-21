package com.example.hoteladvisor.presentation.hotelrooms

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.hoteladvisor.databinding.ItemHotelRoomBinding
import com.example.hoteladvisor.domain.models.HotelRoomEntity
import javax.inject.Inject

class HotelRoomsAdapter @Inject constructor():
    ListAdapter<HotelRoomEntity, HotelRoomsViewHolder>(HotelRoomCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelRoomsViewHolder {
        val binding = ItemHotelRoomBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return HotelRoomsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HotelRoomsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}