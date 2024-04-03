package com.example.programminginfo.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.programminginfo.data.InformationData
import com.example.programminginfo.databinding.ItemTopBinding

class MainTopAdapter : ListAdapter<InformationData, MainTopAdapter.MainTopViewHolder>(difUtil) {
    private lateinit var clickItem: (data: InformationData) -> Unit
    private var time = System.currentTimeMillis()
    object difUtil : DiffUtil.ItemCallback<InformationData>() {
        override fun areItemsTheSame(oldItem: InformationData, newItem: InformationData): Boolean =
            oldItem.image == newItem.image

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(
            oldItem: InformationData,
            newItem: InformationData
        ): Boolean =
            oldItem == newItem

    }

    inner class MainTopViewHolder(private val binding: ItemTopBinding) : ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener{
                if (System.currentTimeMillis() - time > 500) {
                    clickItem.invoke(getItem(adapterPosition))
                }
                time = System.currentTimeMillis()
            }
        }

        fun bind(data: InformationData) {
//            binding.circleImageView.setImageResource(data.image)
            Glide.with(binding.root)
                .load(data.image)
                .into(binding.circleImageView)
            binding.textName.text = data.name
            binding.textDescreption.text = data.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainTopViewHolder =
        MainTopViewHolder(
            ItemTopBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MainTopViewHolder, position: Int) =
        holder.bind(getItem(position))

    fun setOnClickItem(block: (InformationData) -> Unit) {
        clickItem = block
    }

}