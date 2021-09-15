package com.example.daggerbasics.di.subscope

import com.example.daggerbasics.data.service.Service
import com.example.daggerbasics.data.service.ServiceImpl
import dagger.Binds
import dagger.Module

@Module
interface SubScopeModule {

    @Binds
    @SubScope
    fun provideService(service: ServiceImpl): Service
}