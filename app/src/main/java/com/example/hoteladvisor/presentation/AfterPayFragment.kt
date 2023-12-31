package com.example.hoteladvisor.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hoteladvisor.databinding.FragmentAfterPayBinding
import java.lang.RuntimeException

class AfterPayFragment : Fragment() {

    private var _binding: FragmentAfterPayBinding? = null
    private val binding: FragmentAfterPayBinding
        get() = _binding ?: throw RuntimeException("binding doesn't exist")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentAfterPayBinding.inflate(inflater, container, false)
        return binding.root
    }

}