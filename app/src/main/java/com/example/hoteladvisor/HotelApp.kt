package com.example.hoteladvisor

import android.app.Application
import com.example.hoteladvisor.di.ApplicationComponent
import com.example.hoteladvisor.di.DaggerApplicationComponent

class HotelApp: Application() {
    val component: ApplicationComponent = DaggerApplicationComponent.create()
}