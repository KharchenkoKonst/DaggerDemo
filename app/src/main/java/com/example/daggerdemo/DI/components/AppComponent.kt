package com.example.daggerdemo.DI.components

import com.example.daggerdemo.view.MainActivity
import com.example.daggerdemo.DI.modules.AppModule
import com.example.daggerdemo.dependencies.app_scope.Utils
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    val utils: Utils

//    fun inject(mainActivity: MainActivity)
}