package com.example.hoteladvisor.di

import com.example.hoteladvisor.presentation.hotel.HotelFragment
import com.example.hoteladvisor.presentation.hotelrooms.HotelRoomsFragment
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
}