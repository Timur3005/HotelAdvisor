package com.example.hoteladvisor.presentation.hotel

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.hoteladvisor.databinding.ImageItemBinding
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

    override fun onBindViewHolder(holder: ImageViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val url = getItem(position)
        val image = holder.binding.imageView
        Glide.with(holder.binding.root)
            .load(url)
            .listener(object : RequestListener<Drawable?> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable?>,
                    isFirstResource: Boolean,
                ): Boolean {
                    submitList(currentList.filterIndexed { index, _ -> index != position })
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable,
                    model: Any,
                    target: Target<Drawable?>?,
                    dataSource: DataSource,
                    isFirstResource: Boolean,
                ): Boolean {
                    return false
                }
            })
            .into(image)
    }



}
