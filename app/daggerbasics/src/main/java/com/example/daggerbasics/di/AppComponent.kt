package com.example.daggerbasics.di

import com.example.daggerbasics.domain.interactors.Interactor
import com.example.daggerbasics.domain.repositories.Repository
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    val repository: Repository
    fun getInteractor(): Interactor
}
