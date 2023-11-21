package com.example.hoteladvisor.presentation.hotel

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.hoteladvisor.HotelApp
import com.example.hoteladvisor.R
import com.example.hoteladvisor.databinding.FragmentHotelBinding
import com.example.hoteladvisor.presentation.ViewModelFactory
import javax.inject.Inject

class HotelFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var imagesAdapter: ImagesAdapter

    private val component by lazy {
        (activity?.application as HotelApp).component
    }

    private lateinit var viewModel: HotelViewModel

    private var _binding: FragmentHotelBinding? = null
    private val binding: FragmentHotelBinding
        get() = _binding ?: throw RuntimeException("binding doesn't exist")

    override fun onAttach(context: Context) {
        super.onAttach(context)
        component.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHotelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory)[HotelViewModel::class.java]
        viewModel.getHotel()
        observeViewModel()
        binding.viewPagerHotelImages.adapter = imagesAdapter
        binding.moveToRoomChoosing.setOnClickListener {
            navigateToHotelRoomsFragment()
        }
    }

    private fun observeViewModel() {
        viewModel.hotelState.observe(viewLifecycleOwner) {
            when (it) {
                Loading -> {
                    binding.progressBarLoading.visibility = View.VISIBLE
                }

                is ShowHotel -> {
                    binding.progressBarLoading.visibility = View.GONE
                    val hotel = it.hotelEntity
                    with(binding){
                        hotelName.text = hotel.name
                        rating.text = hotel.rating.toString() + " " + hotel.ratingName
                        address.text = hotel.address
                        priceFrom.text = "от " + hotel.minPrice
                        priceForIt.text = hotel.priceFor
                        description.text = hotel.hotelDescription
                        imagesAdapter.submitList(hotel.images)
                    }
                }
            }
        }
    }

    private fun navigateToHotelRoomsFragment(){
        findNavController().navigate(R.id.action_hotelFragment_to_hotelRoomsFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}