package com.example.programminginfo.presentation.screen

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SearchView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.programminginfo.MainActivity
import com.example.programminginfo.R
import com.example.programminginfo.data.MyShared
import com.example.programminginfo.databinding.ScreenMainBinding
import com.example.programminginfo.presentation.adapter.MainAllAdapter
import com.example.programminginfo.presentation.adapter.MainTopAdapter
import com.example.programminginfo.presentation.util.myLog
import com.example.programminginfo.presentation.viewmodel.MainScreenViewModule
import com.example.programminginfo.presentation.viewmodel.impl.MainScreenViewModuleImpl
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class ScreenMain : Fragment(R.layout.screen_main) {
    private val binding by viewBinding(ScreenMainBinding::bind)
    private val viewModule: MainScreenViewModule by viewModels<MainScreenViewModuleImpl>()
    private var currentQuery: String? = null
    private val adapterTop by lazy { MainTopAdapter() }
    private val adapterAll by lazy { MainAllAdapter() }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        load()
        binding.rvListTop.adapter = adapterTop
        binding.rvListTop.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        adapterTop.setOnClickItem {
            findNavController().navigate(ScreenMainDirections.actionScreenMainToScreenInfo(it))
        }

        binding.rvList.adapter = adapterAll
        binding.rvList.layoutManager = LinearLayoutManager(requireContext())

        adapterAll.setOnClickItem {
            findNavController().navigate(ScreenMainDirections.actionScreenMainToScreenInfo(it))
        }
        viewModule.submitListAll
            .onEach {
                adapterAll.submitList(it)
                it.size.toString() + " all list".myLog()
            }
            .launchIn(lifecycleScope)

        viewModule.submitListTop
            .onEach {
                it.size.toString() + " top list".myLog()
                adapterTop.submitList(it)
            }
            .launchIn(lifecycleScope)

        binding.linearLayoutBack.setOnClickListener {
            MyShared.setBoolean(false)
            isHasVisibility(true)
            viewModule.getByCountList(5)
            viewModule.getByCountListTop(10)
        }

        binding.linearLayoutAll.setOnClickListener {
            MyShared.setBoolean(true)
            isHasVisibility(false)
            viewModule.getAllList()
        }

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                currentQuery = newText
                if (currentQuery == null || currentQuery!!.isEmpty()) load()
                else {
                    isHasVisibility(false)
                    viewModule.getByQueryList(currentQuery!!)
                }
                return true
            }
        })
        val closeButton =
            binding.searchView.findViewById(androidx.appcompat.R.id.search_close_btn) as ImageView

        closeButton.setOnClickListener {
            binding.searchView.setQuery(null, false)
            binding.searchView.clearFocus()
        }

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                AlertDialog.Builder(requireContext())
                    .setTitle("Exit")
                    .setMessage("Do you want to exit the info programming application?")
                    .setNegativeButton("No") { dialog, which -> }
                    .setPositiveButton("Yes") { dialog, which ->
                        requireActivity().finish()
                    }.create().show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(callback)

        binding.btnDispatcher.setOnClickListener {
            openTelegram()
        }

    }

    fun isHasVisibility(bool: Boolean) {
        binding.rvListTop.isVisible = bool
        binding.linearLayoutAll.isVisible = bool
        binding.textTop.isVisible = bool
        binding.linearLayoutBack.isVisible = bool != true
    }

    fun load() {
        if (MyShared.getBoolean()) {
            viewModule.getAllList()
            isHasVisibility(false)
        } else {
            isHasVisibility(true)
            viewModule.getByCountList(5)
            viewModule.getByCountListTop(10)
        }
    }
    fun openTelegram() {
        val telegramUri = Uri.parse("https://t.me/muhriddin7675") // Replace "your_telegram_channel" with the desired Telegram channel or username
        val intent = Intent(Intent.ACTION_VIEW, telegramUri)

        // Check if there is an app to handle this intent
        if (intent.resolveActivity(requireContext().packageManager) != null) {
            startActivity(intent)
        } else {
            // Handle case when no application can handle the intent
            // For example, you can open Telegram in a web browser
            val webIntent = Intent(Intent.ACTION_VIEW, telegramUri)
            startActivity(webIntent)
        }
    }
}