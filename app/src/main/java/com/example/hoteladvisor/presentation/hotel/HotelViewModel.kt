package com.example.hoteladvisor.presentation.hotel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hoteladvisor.domain.models.HotelEntity
import com.example.hoteladvisor.domain.usecases.GetHotelUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class HotelViewModel @Inject constructor(
    private val getHotelUseCase: GetHotelUseCase
): ViewModel() {

    private val _process = MutableLiveData(true)
    val process: LiveData<Boolean>
        get() = _process

    private val _hotel = MutableLiveData<HotelEntity?>()
    val hotel: LiveData<HotelEntity?>
        get() = _hotel

    fun getHotel(){
        val job = viewModelScope.launch {
            _hotel.value = getHotelUseCase()
        }
        viewModelScope.launch {
            job.join()
            _process.value = false
        }
    }
}