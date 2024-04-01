package com.example.programminginfo.presentation.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.programminginfo.R
import com.example.programminginfo.databinding.ScreenInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ScreenInfo : Fragment(R.layout.screen_info) {
    private val binding by viewBinding(ScreenInfoBinding::bind)
    private val navArgs: ScreenInfoArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.image.setImageResource(navArgs.data.image)
        binding.textName.text = navArgs.data.name
        binding.textDescreption.text = navArgs.data.description
        binding.btnClose.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}