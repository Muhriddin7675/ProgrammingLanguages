package com.example.programminginfo.presentation.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.programminginfo.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashScreen : Fragment(R.layout.screen_splash) {

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        lifecycleScope.launch {
//            delay(2000)
//            findNavController().navigate(SplashScreenDirections.actionSplashScreenToScreenMain())
//        }
//    }

    override fun onStart() {
        super.onStart()
        lifecycleScope.launch {
            delay(2000)
            findNavController().navigate(SplashScreenDirections.actionSplashScreenToScreenMain())
        }
    }
}