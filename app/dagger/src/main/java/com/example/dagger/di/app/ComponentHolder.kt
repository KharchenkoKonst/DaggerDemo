package com.example.dagger.di.app

import android.app.Application
import com.example.dagger.di.first_activities_scope.DaggerFirstActivitiesComponent
import com.example.dagger.di.second_activities_scope.DaggerSecondActivitiesComponent

class ComponentHolder : Application() {

    companion object {

        val appComponent = DaggerAppComponent.create()

        val firstActivityComponent = DaggerFirstActivitiesComponent.builder()
            .appComponent(appComponent)
            .build()

        val secondActivityComponent = DaggerSecondActivitiesComponent.builder()
            .appComponent(appComponent)
            .build()
    }
}