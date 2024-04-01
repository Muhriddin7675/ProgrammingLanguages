package com.example.programminginfo.presentation.viewmodel

import com.example.programminginfo.data.InformationData
import kotlinx.coroutines.flow.Flow

interface MainScreenViewModule {
    val submitListTop: Flow<List<InformationData>>
    val submitListAll: Flow<List<InformationData>>

    fun getAllList()
    fun getByCountListTop(count:Int)
    fun getByCountList(count: Int)
    fun getByQueryList(query: String)
}