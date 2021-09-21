package com.example.dagger.di.second_activities_scope

import com.example.dagger.di.app.AppComponent
import com.example.dagger.presentation.second_scope.Activity3
import dagger.Component

@SecondActivitiesScope
@Component(
    dependencies = [AppComponent::class],
    modules = [SecondActivitiesModule::class]
)
interface SecondActivitiesComponent {

    fun inject(activity: Activity3)
}
