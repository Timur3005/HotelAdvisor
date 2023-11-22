package com.example.hoteladvisor.presentation.reservation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hoteladvisor.HotelApp
import com.example.hoteladvisor.databinding.FragmentReservationBinding
import com.example.hoteladvisor.presentation.ViewModelFactory
import java.text.SimpleDateFormat
import java.util.Locale
import javax.inject.Inject
import kotlin.math.abs
import kotlin.time.Duration.Companion.milliseconds

class ReservationFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private var _binding: FragmentReservationBinding? = null
    private val binding: FragmentReservationBinding
        get() = _binding ?: throw RuntimeException("binding doesn't exist")

    private val component by lazy {
        (activity?.application as HotelApp).component
    }

    private lateinit var viewModel: ReservationViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        component.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentReservationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            ViewModelProvider(this, viewModelFactory)[ReservationViewModel::class.java]
        viewModel.loadReservation()
        observeViewModel()
    }

    private fun observeViewModel(){
        viewModel.state.observe(viewLifecycleOwner){
            when(it){
                Loading -> {
                    binding.progressBarLoading.visibility = View.VISIBLE
                }
                is ShowReservation -> {
                    val reservation = it.reservation
                    with(binding){
                        rating.text = reservation.hotelRating?.toString() + " " + reservation.ratingName
                        hotelName.text = reservation.hotelName
                        address.text = reservation.hotelAddress
                        progressBarLoading.visibility = View.GONE
                        flyFrom.text = reservation.departure
                        country.text = reservation.arrivalCountry
                        dates.text = reservation.tourDateStart + " - " + reservation.tourDateStop
                        countOfNights.text =
                            (daysBetweenDates(
                                reservation.tourDateStart,
                                reservation.tourDateStop)-1).toString()+ " ночей"

                        hotel.text = reservation.hotelName
                        room.text = reservation.roomDescription
                        nutrition.text = reservation.nutrition
                    }

                }
            }
        }
    }

    private fun daysBetweenDates(date1: String?, date2: String?): Int {
        val dateFormat = SimpleDateFormat("dd.MM.yy", Locale.getDefault())
        val parsedDate1 = date1?.let { dateFormat.parse(it) } ?: return 0
        val parsedDate2 = date2?.let { dateFormat.parse(it) } ?: return 0

        val timeDiffMillis = abs(parsedDate2.time - parsedDate1.time)

        val duration = timeDiffMillis.milliseconds
        return duration.inWholeDays.toInt()
    }
}