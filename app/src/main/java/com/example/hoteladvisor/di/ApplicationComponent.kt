package com.example.hoteladvisor.di

import com.example.hoteladvisor.presentation.hotel.HotelFragment
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
}