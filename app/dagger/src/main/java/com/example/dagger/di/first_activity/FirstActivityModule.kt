package com.example.dagger.di.first_activity

import com.example.dagger.data.service.Service
import com.example.dagger.data.service.FirstServiceImpl
import dagger.Binds
import dagger.Module

@Module
interface FirstActivityModule {

    @Binds
    @FirstActivitiesScope
    fun provideService(service: FirstServiceImpl): Service
}