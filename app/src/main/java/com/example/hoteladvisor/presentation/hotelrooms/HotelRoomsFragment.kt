package com.example.hoteladvisor.presentation.hotelrooms

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hoteladvisor.HotelApp
import com.example.hoteladvisor.databinding.FragmentHotelRoomsBinding
import com.example.hoteladvisor.presentation.ViewModelFactory
import javax.inject.Inject

class HotelRoomsFragment : Fragment() {

    @Inject
    lateinit var roomsAdapter: HotelRoomsAdapter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val args by navArgs<HotelRoomsFragmentArgs>()

    private var _binding: FragmentHotelRoomsBinding? = null
    private val binding: FragmentHotelRoomsBinding
        get() = _binding ?: throw RuntimeException("binding doesn't exist")

    private val component by lazy {
        (activity?.application as HotelApp).component
    }

    private lateinit var viewModel: HotelRoomsViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        component.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHotelRoomsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory)[HotelRoomsViewModel::class.java]
        viewModel.loadRooms()
        binding.buttonPopBackstack.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.hotelName.text = args.hotelName
        println(args.hotelName)
        setupRecycler()
        observeViewModels()
    }

    private fun setupRecycler() {
        binding.listOfRooms.layoutManager = LinearLayoutManager(context)
        binding.listOfRooms.adapter = roomsAdapter
    }

    private fun observeViewModels(){
        viewModel.state.observe(viewLifecycleOwner){
            when(it){
                Loading -> {
                    binding.progressBarLoading.visibility = View.VISIBLE
                }
                is ShowRooms -> {
                    binding.progressBarLoading.visibility = View.GONE
                    roomsAdapter.submitList(it.rooms)
                    println(it.rooms)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}