package com.example.dagger.di.app

import com.example.dagger.domain.interactors.Interactor
import com.example.dagger.domain.repositories.Repository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun repository(): Repository
    fun interactor(): Interactor
}
