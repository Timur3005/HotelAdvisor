package com.example.hoteladvisor.di

import androidx.lifecycle.ViewModel
import com.example.hoteladvisor.presentation.hotel.HotelViewModel
import com.example.hoteladvisor.presentation.hotelrooms.HotelRoomsViewModel
import com.example.hoteladvisor.presentation.reservation.ReservationViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(HotelViewModel::class)
    @Binds
    fun bindHotelViewModel(impl: HotelViewModel): ViewModel

    @IntoMap
    @ViewModelKey(HotelRoomsViewModel::class)
    @Binds
    fun bindHotelRoomsViewModel(impl: HotelRoomsViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ReservationViewModel::class)
    @Binds
    fun bindReservationViewModel(impl: ReservationViewModel): ViewModel
}