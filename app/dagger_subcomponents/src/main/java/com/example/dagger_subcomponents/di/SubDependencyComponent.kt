package com.example.dagger_subcomponents.di

import com.example.dagger_subcomponents.view.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [SubDependencyModule::class])
interface SubDependencyComponent {

    fun inject(activity: MainActivity)
}