package com.example.dagger.di

import android.app.Application
import com.example.dagger.di.subscope.DaggerActivityComponent

class ComponentHolder : Application() {

    companion object {

        val appComponent = DaggerAppComponent.create()
        val activityComponent = DaggerActivityComponent.builder()
            .appComponent(appComponent)
            .build()
    }
}