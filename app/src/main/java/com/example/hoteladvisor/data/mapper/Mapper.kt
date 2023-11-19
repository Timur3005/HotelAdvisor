package com.example.hoteladvisor.data.mapper

import androidx.lifecycle.LiveData
import com.example.hoteladvisor.data.remote.models.HotelDto
import com.example.hoteladvisor.domain.models.HotelEntity
import javax.inject.Inject

class Mapper @Inject constructor(){
    fun mapHotelDtoToHotelEntity(hotelDto: HotelDto) = HotelEntity(
        id = hotelDto.id,
        name = hotelDto.name,
        address = hotelDto.address,
        minPrice = hotelDto.minPrice,
        priceFor = hotelDto.priceFor,
        rating = hotelDto.rating,
        ratingName = hotelDto.ratingName,
        hotelDescription = hotelDto.aboutTheHotel?.hotelDescription,
        peculiarities = hotelDto.aboutTheHotel?.peculiarities,
        images = hotelDto.images
    )
}