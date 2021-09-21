package com.example.dagger.di.first_activities_scope

import com.example.dagger.data.service.Service
import com.example.dagger.data.service.FirstServiceImpl
import com.example.dagger.data.service.SecondServiceImpl
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
interface FirstActivitiesModule {

    @Named("FirstService")
    @Binds
    @FirstActivitiesScope
    fun provideFirstService(service: FirstServiceImpl): Service

    @Named("SecondService")
    @Binds
    @FirstActivitiesScope
    fun provideSecondService(service: SecondServiceImpl): Service
}