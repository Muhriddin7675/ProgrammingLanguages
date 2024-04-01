package com.example.programminginfo.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.programminginfo.data.InformationData
import com.example.programminginfo.databinding.ItemAllBinding

class MainAllAdapter : ListAdapter<InformationData, MainAllAdapter.MainAllViewHolder>(difUtil) {
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

    inner class MainAllViewHolder(private val binding: ItemAllBinding) : ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                if(System.currentTimeMillis() - time > 500){
                    clickItem.invoke(getItem(adapterPosition))
                }
                time = System.currentTimeMillis()
            }
        }

        fun bind(data: InformationData) {
            binding.image.setImageResource(data.image)
            binding.textName.text = data.name
            binding.textDescreption.text = data.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAllViewHolder =
        MainAllViewHolder(
            ItemAllBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MainAllViewHolder, position: Int) =
        holder.bind(getItem(position))

    fun setOnClickItem(block: (InformationData) -> Unit) {
        clickItem = block
    }

}