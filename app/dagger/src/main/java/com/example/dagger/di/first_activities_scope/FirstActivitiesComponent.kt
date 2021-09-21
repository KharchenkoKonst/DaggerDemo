package com.example.dagger.di.first_activities_scope

import com.example.dagger.di.app.AppComponent
import com.example.dagger.presentation.first_scope.Activity1
import com.example.dagger.presentation.first_scope.Activity2
import dagger.Component

@FirstActivitiesScope
@Component(
    dependencies = [AppComponent::class],
    modules = [FirstActivitiesModule::class]
)
interface FirstActivitiesComponent {

    fun inject(activity: Activity1)
    fun inject(activity: Activity2)
}