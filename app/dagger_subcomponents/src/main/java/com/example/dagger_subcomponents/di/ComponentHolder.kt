package com.example.dagger_subcomponents.di

class ComponentHolder {
    companion object {

        val dependencyComponent = DaggerDependencyComponent.create()

        val subDependencyComponent = dependencyComponent.plusSubDependencyComponent()
    }
}