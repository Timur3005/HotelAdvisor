package com.example.hoteladvisor.presentation.reservation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hoteladvisor.domain.usecases.GetReservationUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class ReservationViewModel @Inject constructor(
    private val getReservationUseCase: GetReservationUseCase
): ViewModel() {

    private val _state = MutableLiveData<ReservationState>()
    val state: LiveData<ReservationState>
        get() = _state

    fun loadReservation(){
        _state.value = Loading
        viewModelScope.launch {
            _state.value = ShowReservation(getReservationUseCase())
        }
    }
}