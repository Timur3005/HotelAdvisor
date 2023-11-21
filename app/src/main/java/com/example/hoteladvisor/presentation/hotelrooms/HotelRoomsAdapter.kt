package com.example.hoteladvisor.presentation.hotelrooms

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.hoteladvisor.databinding.ItemHotelRoomBinding
import com.example.hoteladvisor.domain.models.HotelRoomEntity
import com.example.hoteladvisor.presentation.hotel.ImagesAdapter
import javax.inject.Inject

class HotelRoomsAdapter @Inject constructor(
    private val imagesAdapter: ImagesAdapter
): ListAdapter<HotelRoomEntity, HotelRoomsViewHolder>(HotelRoomCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelRoomsViewHolder {
        val binding = ItemHotelRoomBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return HotelRoomsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HotelRoomsViewHolder, position: Int) {
        val room = getItem(position)
        println(room)
        imagesAdapter.submitList(room.images)
        with(holder.binding){
            roomImages.offscreenPageLimit = 2
            roomImages.adapter = imagesAdapter
            roomName.text = room.name
            price.text = room.price?.toString()
            pricePer.text = room.pricePer
        }
    }

}