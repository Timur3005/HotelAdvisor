package com.example.hoteladvisor.presentation.hotel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.hoteladvisor.databinding.ImageItemBinding
import com.squareup.picasso.Picasso
import javax.inject.Inject

class ImagesAdapter @Inject constructor(): ListAdapter<String, ImageViewHolder>(StringItemCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ImageItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val url = getItem(position)
        val image = holder.binding.imageView
        Picasso.get().load(url).into(image)
    }

}
