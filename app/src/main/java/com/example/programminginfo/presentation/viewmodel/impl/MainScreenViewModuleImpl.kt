package com.example.programminginfo.presentation.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.programminginfo.data.InformationData
import com.example.programminginfo.domain.AppRepository
import com.example.programminginfo.presentation.util.myLog
import com.example.programminginfo.presentation.viewmodel.MainScreenViewModule
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModuleImpl @Inject constructor(
    private val repository: AppRepository
) : ViewModel(), MainScreenViewModule {
    override val submitListTop = MutableSharedFlow<List<InformationData>>()
    override val submitListAll = MutableSharedFlow<List<InformationData>>()

    override fun getAllList() {
        repository.getAllList()
            .onEach {
                it.size.toString() + "ViewModule all ".myLog()
                submitListAll.emit(it)
            }
            .launchIn(viewModelScope)
    }

    override fun getByCountListTop(count: Int) {
        repository.getByNumberList(count)
            .onEach {
                it.size.toString() + "ViewModule Top ".myLog()
                submitListTop.emit(it)
            }
            .launchIn(viewModelScope)
    }

    override fun getByCountList(count: Int) {
        repository.getByNumberList(count)
            .onEach {
                it.size.toString() + "ViewModule all Count ".myLog()
                submitListAll.emit(it)
            }
            .launchIn(viewModelScope)
    }

    override fun getByQueryList(query: String) {
        repository.getByCurrentQuery(query)
            .onEach {
                submitListAll.emit(it)
            }
            .launchIn(viewModelScope)
    }

}