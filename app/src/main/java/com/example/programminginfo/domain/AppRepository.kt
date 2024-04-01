package com.example.programminginfo.domain

import com.example.programminginfo.data.InformationData
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getAllList(): Flow<List<InformationData>>
    fun getByNumberList(count: Int): Flow<ArrayList<InformationData>>
    fun getByCurrentQuery(query: String): Flow<ArrayList<InformationData>>
}