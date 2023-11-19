package com.example.hoteladvisor.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hoteladvisor.R
import com.example.hoteladvisor.databinding.ActivityMainBinding
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding ?: throw RuntimeException("binding isn't exist")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}