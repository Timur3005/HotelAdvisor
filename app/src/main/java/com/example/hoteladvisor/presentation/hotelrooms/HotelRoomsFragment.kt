package com.example.hoteladvisor.presentation.hotelrooms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hoteladvisor.databinding.FragmentHotelRoomsBinding

class HotelRoomsFragment : Fragment() {

    private var _binding: FragmentHotelRoomsBinding? = null
    private val binding: FragmentHotelRoomsBinding
        get() = _binding ?: throw RuntimeException("binding doesn't exist")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHotelRoomsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonPopBackstack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}