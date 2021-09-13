package com.example.daggerbasics.di

import com.example.daggerbasics.domain.interactors.Interactor
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    fun getInteractor(): Interactor
}
