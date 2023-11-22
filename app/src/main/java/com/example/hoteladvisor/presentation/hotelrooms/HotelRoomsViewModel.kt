package com.example.hoteladvisor.presentation.hotelrooms

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hoteladvisor.domain.usecases.GetHotelRoomsUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class HotelRoomsViewModel @Inject constructor(
    private val getHotelRoomsUseCase: GetHotelRoomsUseCase
): ViewModel() {

    private val _state = MutableLiveData<HotelRoomsState>()
    val state: LiveData<HotelRoomsState>
        get() = _state

    fun loadRooms(){
        _state.value = Loading
        viewModelScope.launch {
            val rooms = getHotelRoomsUseCase()
            _state.value = ShowRooms(rooms)
        }
    }
}