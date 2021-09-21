package com.example.dagger.di.first_activities_scope

import com.example.dagger.data.service.Service
import com.example.dagger.data.service.FirstServiceImpl
import dagger.Binds
import dagger.Module

@Module
interface FirstActivitiesModule {

    @Binds
    @FirstActivitiesScope
    fun provideService(service: FirstServiceImpl): Service
}