package com.example.hoteladvisor.di

import androidx.lifecycle.ViewModel
import com.example.hoteladvisor.presentation.hotel.HotelViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @ViewModelKey(HotelViewModel::class)
    @IntoMap
    fun bindHotelViewModel(impl: HotelViewModel): ViewModel
}