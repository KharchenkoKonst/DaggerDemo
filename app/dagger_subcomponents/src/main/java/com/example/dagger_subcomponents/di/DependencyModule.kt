package com.example.dagger_subcomponents.di

import com.example.dagger_subcomponents.data.Dependency
import com.example.dagger_subcomponents.data.DependencyImpl
import dagger.Binds
import dagger.Module

@Module
interface DependencyModule {

    @Binds
    fun provideDependency(dependency: DependencyImpl): Dependency
}