package com.example.daggerbasics.di

import com.example.daggerbasics.data.repositories.RepositoryImpl
import com.example.daggerbasics.domain.interactors.Interactor
import com.example.daggerbasics.domain.interactors.InteractorImpl
import com.example.daggerbasics.domain.repositories.Repository
import dagger.Binds
import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Module(includes = [AndroidSupportInjectionModule::class])
interface AppModule {

    @Binds
    @Singleton
    fun provideInteractor(interactor: InteractorImpl): Interactor

    @Binds
    @Singleton
    fun provideRepository(repository: RepositoryImpl): Repository
}