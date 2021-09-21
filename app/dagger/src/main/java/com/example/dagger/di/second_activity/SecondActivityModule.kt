package com.example.dagger.di.second_activity

import com.example.dagger.data.service.Service
import com.example.dagger.data.service.FirstServiceImpl
import dagger.Binds
import dagger.Module

@Module
interface SecondActivityModule {

    @Binds
    @SecondActivityScope
    fun provideService(service: FirstServiceImpl): Service
}
