package com.example.dagger.di.second_activities_scope

import com.example.dagger.data.service.Service
import com.example.dagger.data.service.FirstServiceImpl
import com.example.dagger.di.custom_qualifier.CustomName
import com.example.dagger.di.custom_qualifier.EnumQualifiers.FirstQualifier
import com.example.dagger.di.custom_qualifier.EnumQualifiers.SecondQualifier
import dagger.Binds
import dagger.Module

@Module
interface SecondActivitiesModule {

    @CustomName(SecondQualifier)
    @Binds
    @SecondActivitiesScope
    fun provideFirstService(service: FirstServiceImpl): Service

    @CustomName(FirstQualifier)
    @Binds
    @SecondActivitiesScope
    fun provideSecondService(service: FirstServiceImpl): Service
}
