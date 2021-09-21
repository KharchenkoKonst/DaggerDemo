package com.example.dagger.di.app

import android.app.Application
import com.example.dagger.di.first_activity.DaggerFirstActivitiesComponent
import com.example.dagger.di.second_activity.DaggerSecondActivityComponent

class ComponentHolder : Application() {

    companion object {

        val appComponent = DaggerAppComponent.create()

        val firstActivityComponent = DaggerFirstActivitiesComponent.builder()
            .appComponent(appComponent)
            .build()
//
//        val secondActivityComponent = DaggerSecondActivityComponent.builder()
//            .appComponent(appComponent)
//            .build()
    }
}