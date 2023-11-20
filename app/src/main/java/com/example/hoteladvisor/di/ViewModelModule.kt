package com.example.hoteladvisor.di

import androidx.lifecycle.ViewModel
import com.example.hoteladvisor.presentation.hotel.HotelViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(HotelViewModel::class)
    @Binds
    fun bindHotelViewModel(impl: HotelViewModel): ViewModel
}