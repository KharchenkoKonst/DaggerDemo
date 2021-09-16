package com.example.dagger.di.subscope

import com.example.dagger.di.AppComponent
import com.example.dagger.presentation.view.MainActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)
}