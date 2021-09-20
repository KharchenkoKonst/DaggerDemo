package com.example.koin

import android.app.Application
import com.example.koin.di.module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

//как инициализировать коин без Application() (конмпоненты)
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(module))
        }
    }
}