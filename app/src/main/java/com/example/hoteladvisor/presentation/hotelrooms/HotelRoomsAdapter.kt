package com.example.hoteladvisor.presentation.hotelrooms

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import com.example.hoteladvisor.databinding.ItemHotelRoomBinding
import com.example.hoteladvisor.domain.models.HotelRoomEntity
import com.example.hoteladvisor.presentation.hotel.ImagesAdapter
import javax.inject.Inject

class HotelRoomsAdapter @Inject constructor(
    private val imagesAdapter: ImagesAdapter
): ListAdapter<HotelRoomEntity, HotelRoomsViewHolder>(HotelRoomCallback) {

    var clickToChooseRoom: (() -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelRoomsViewHolder {
        val binding = ItemHotelRoomBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return HotelRoomsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HotelRoomsViewHolder, position: Int) {
        val room = getItem(position)
        imagesAdapter.submitList(room.images)
        with(holder.binding){
            roomImages.offscreenPageLimit = 2
            roomImages.adapter = imagesAdapter
            roomName.text = room.name
            price.text = room.price?.toString()
            pricePer.text = room.pricePer
            setupPeculiarities(room.peculiarities, this)
            moveToNextStep.setOnClickListener {
                clickToChooseRoom?.invoke()
            }
        }
    }

    private fun setupPeculiarities(peculiarities: List<String>?, binding: ItemHotelRoomBinding) {
        binding.peculiarities.columnCount = GridLayout.IMPORTANT_FOR_AUTOFILL_YES
        binding.peculiarities.rowCount = GridLayout.IMPORTANT_FOR_AUTOFILL_YES
        binding.peculiarities.alignmentMode = GridLayout.ALIGN_BOUNDS
        if (!peculiarities.isNullOrEmpty()) {
            for (i in peculiarities) {
                val textView = TextView(binding.root.context)
                textView.text = i
                binding.peculiarities.addView(textView)
            }
        }
    }

}