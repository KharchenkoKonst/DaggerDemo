package com.example.dagger.di.second_activities_scope

import com.example.dagger.data.service.Service
import com.example.dagger.data.service.FirstServiceImpl
import dagger.Binds
import dagger.Module

@Module
interface SecondActivitiesModule {

    @Binds
    @SecondActivitiesScope
    fun provideService(service: FirstServiceImpl): Service
}
