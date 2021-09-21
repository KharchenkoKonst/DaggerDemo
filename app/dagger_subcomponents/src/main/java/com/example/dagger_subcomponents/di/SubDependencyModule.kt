package com.example.dagger_subcomponents.di

import com.example.dagger_subcomponents.data.SubDependency
import com.example.dagger_subcomponents.data.SubDependencyImpl
import dagger.Binds
import dagger.Module

@Module
interface SubDependencyModule {

    @Binds
    fun provideSubDependency(subDependency: SubDependencyImpl): SubDependency
}