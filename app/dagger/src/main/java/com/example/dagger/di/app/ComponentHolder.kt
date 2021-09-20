package com.example.dagger.di.app

import android.app.Application
import com.example.dagger.di.first_activity.DaggerFirstActivityComponent
import com.example.dagger.di.second_activity.DaggerSecondActivityComponent

class ComponentHolder : Application() {

    companion object {

        val appComponent = DaggerAppComponent.create()

        val firstActivityComponent = DaggerFirstActivityComponent.builder()
            .appComponent(appComponent)
            .build()

        val secondActivityComponent = DaggerSecondActivityComponent.builder()
            .appComponent(appComponent)
            .build()
    }
}