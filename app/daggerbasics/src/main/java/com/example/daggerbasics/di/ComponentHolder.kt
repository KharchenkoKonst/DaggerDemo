package com.example.daggerbasics.di

import android.app.Application

class ComponentHolder : Application() {

    companion object {

        private val appComponent = DaggerAppComponent.create()
        fun getAppComponent() = appComponent
    }
}