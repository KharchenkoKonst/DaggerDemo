package com.example.dagger.di.subscope

import com.example.dagger.data.service.Service
import com.example.dagger.data.service.ServiceImpl
import dagger.Binds
import dagger.Module

@Module
interface ActivityModule {

    @Binds
    @ActivityScope
    fun provideService(service: ServiceImpl): Service
}