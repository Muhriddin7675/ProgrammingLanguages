package com.example.programminginfo.di

import com.example.programminginfo.domain.AppRepository
import com.example.programminginfo.domain.AppRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun getRepository(impl: AppRepositoryImpl):AppRepository
}