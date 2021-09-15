package com.example.daggerbasics.di

import com.example.daggerbasics.domain.interactors.Interactor
import com.example.daggerbasics.domain.repositories.Repository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun repository(): Repository
    fun interactor(): Interactor
}
