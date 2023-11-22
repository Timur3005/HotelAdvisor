package com.example.hoteladvisor.di

import com.example.hoteladvisor.presentation.hotel.HotelFragment
import com.example.hoteladvisor.presentation.hotelrooms.HotelRoomsFragment
import com.example.hoteladvisor.presentation.reservation.ReservationFragment
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        ViewModelModule::class,
        DataModule::class
    ]
)
interface ApplicationComponent {
    fun inject(fragment: HotelFragment)
    fun inject(fragment: HotelRoomsFragment)
    fun inject(fragment: ReservationFragment)
}