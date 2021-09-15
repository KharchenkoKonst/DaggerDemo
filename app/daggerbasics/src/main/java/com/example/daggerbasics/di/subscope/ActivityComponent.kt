package com.example.daggerbasics.di.subscope

import com.example.daggerbasics.di.AppComponent
import com.example.daggerbasics.presentation.view.MainActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)
}