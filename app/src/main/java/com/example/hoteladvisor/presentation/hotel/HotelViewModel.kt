package com.example.hoteladvisor.presentation.hotel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hoteladvisor.domain.usecases.GetHotelUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class HotelViewModel @Inject constructor(
    private val getHotelUseCase: GetHotelUseCase
): ViewModel() {

    private val _hotelState = MutableLiveData<HotelState>(Loading)
    val hotelState: LiveData<HotelState>
        get() = _hotelState

    fun getHotel(){
        viewModelScope.launch {
            _hotelState.value = ShowHotel(getHotelUseCase())
        }
    }
}