package com.example.hoteladvisor.di

import com.example.hoteladvisor.data.HotelRepositoryImpl
import com.example.hoteladvisor.data.remote.ApiFactory
import com.example.hoteladvisor.data.remote.ApiService
import com.example.hoteladvisor.domain.HotelRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideApiService(): ApiService{
        return ApiFactory.apiService
    }

    @Provides
    fun provideRepository(impl: HotelRepositoryImpl) : HotelRepository = impl
}