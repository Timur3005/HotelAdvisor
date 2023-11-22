package com.example.hoteladvisor.presentation.reservation

import com.example.hoteladvisor.domain.models.ReservationEntity

sealed class ReservationState
data object Loading: ReservationState()
class ShowReservation(val reservation: ReservationEntity): ReservationState()
