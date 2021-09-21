package com.example.dagger_subcomponents.di

import dagger.Component

@Component(modules = [DependencyModule::class])
interface DependencyComponent {
    fun plusSubDependencyComponent(): SubDependencyComponent
}