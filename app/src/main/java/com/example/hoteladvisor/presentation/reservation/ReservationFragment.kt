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
import javax.inject.Inject

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

                }
                is ShowReservation -> {

                }
            }
        }
    }
}