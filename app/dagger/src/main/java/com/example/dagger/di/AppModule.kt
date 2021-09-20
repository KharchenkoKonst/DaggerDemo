package com.example.dagger.di

import com.example.dagger.data.repositories.RepositoryImpl
import com.example.dagger.domain.interactors.Interactor
import com.example.dagger.domain.interactors.InteractorImpl
import com.example.dagger.domain.repositories.Repository
import dagger.Binds
import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

//граф зависимостей
/** Совокупность всех объектов, которые умеет создавать компонент
 * - это граф объектов компонента или граф зависимостей компонента.
 */
@Module(includes = [AndroidSupportInjectionModule::class])
interface AppModule {

    @Binds
    @Singleton
    fun provideInteractor(interactor: InteractorImpl): Interactor

    @Binds
    @Singleton
    fun provideRepository(repository: RepositoryImpl): Repository
}