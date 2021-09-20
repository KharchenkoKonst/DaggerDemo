package com.example.dagger.di.first_activity

import com.example.dagger.data.service.Service
import com.example.dagger.data.service.ServiceImpl
import com.example.dagger.di.first_activity.FirstActivityScope
import dagger.Binds
import dagger.Module

@Module
interface FirstActivityModule {

    @Binds
    @FirstActivityScope
    fun provideService(service: ServiceImpl): Service
}