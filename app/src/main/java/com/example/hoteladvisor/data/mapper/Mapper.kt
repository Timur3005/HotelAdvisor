package com.example.hoteladvisor.data.mapper

import com.example.hoteladvisor.data.remote.models.HotelDto
import com.example.hoteladvisor.data.remote.models.HotelRoomsDto
import com.example.hoteladvisor.data.remote.models.ReservationDto
import com.example.hoteladvisor.di.ApplicationScope
import com.example.hoteladvisor.domain.models.HotelEntity
import com.example.hoteladvisor.domain.models.HotelRoomEntity
import com.example.hoteladvisor.domain.models.ReservationEntity
import javax.inject.Inject

@ApplicationScope
class Mapper @Inject constructor(){
    fun mapHotelDtoToHotelEntity(hotelDto: HotelDto) = HotelEntity(
        id = hotelDto.id,
        name = hotelDto.name,
        address = hotelDto.adress,
        minPrice = hotelDto.minPrice,
        priceFor = hotelDto.priceFor,
        rating = hotelDto.rating,
        ratingName = hotelDto.ratingName,
        hotelDescription = hotelDto.aboutTheHotel?.hotelDescription,
        peculiarities = hotelDto.aboutTheHotel?.peculiarities,
        images = hotelDto.images
    )

    fun mapHotelRoomsDtoToHotelRoomsEntity(hotelRoomsDto: HotelRoomsDto) = HotelRoomEntity(
        id = hotelRoomsDto.id,
        name = hotelRoomsDto.name,
        price = hotelRoomsDto.price,
        pricePer = hotelRoomsDto.pricePer,
        peculiarities = hotelRoomsDto.peculiarities,
        images = hotelRoomsDto.images
    )

    fun mapReservationDtoToReservationEntity(reservationDto: ReservationDto) = ReservationEntity(
        id = reservationDto.id,
        hotelName = reservationDto.hotelName,
        hotelAddress = reservationDto.hotelAddress,
        hotelRating = reservationDto.hotelRating,
        ratingName = reservationDto.ratingName,
        departure = reservationDto.departure,
        arrivalCountry = reservationDto.arrivalCountry,
        tourDateStart = reservationDto.tourDateStart,
        tourDateStop = reservationDto.tourDateStop,
        numberOfNights = reservationDto.numberOfNights,
        roomDescription = reservationDto.roomDescription,
        nutrition = reservationDto.nutrition,
        tourPrice = reservationDto.tourPrice,
        fuelCharge = reservationDto.fuelCharge,
        serviceCharge = reservationDto.serviceCharge
    )
}