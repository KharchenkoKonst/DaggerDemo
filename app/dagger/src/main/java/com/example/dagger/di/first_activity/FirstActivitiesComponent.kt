package com.example.dagger.di.first_activity

import com.example.dagger.di.app.AppComponent
import com.example.dagger.presentation.view.FirstActivity
import com.example.dagger.presentation.view.SecondActivity
import dagger.Component

@FirstActivitiesScope
@Component(
    dependencies = [AppComponent::class],
    modules = [FirstActivityModule::class]
)
interface FirstActivitiesComponent {

    fun inject(activity: FirstActivity)
    fun inject(activity: SecondActivity)
}