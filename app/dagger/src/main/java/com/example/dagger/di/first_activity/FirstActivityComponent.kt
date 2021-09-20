package com.example.dagger.di.first_activity

import com.example.dagger.di.app.AppComponent
import com.example.dagger.presentation.view.FirstActivity
import dagger.Component

@FirstActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [FirstActivityModule::class]
)
interface FirstActivityComponent {

    fun inject(activity: FirstActivity)
}