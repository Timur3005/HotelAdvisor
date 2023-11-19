package com.example.hoteladvisor.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hoteladvisor.databinding.FragmentHotelBinding

class HotelFragment : Fragment() {

    private var _binding: FragmentHotelBinding? = null
    private val binding: FragmentHotelBinding
        get() = _binding ?: throw RuntimeException("binding doesn't exist")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHotelBinding.inflate(inflater, container, false)
        return binding.root
    }

}