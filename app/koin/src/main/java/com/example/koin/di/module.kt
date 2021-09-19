package com.example.koin.di

import com.example.koin.data.repositories.RepositoryImpl
import com.example.koin.data.service.Service
import com.example.koin.data.service.ServiceImpl
import com.example.koin.domain.interactors.Interactor
import com.example.koin.domain.interactors.InteractorImpl
import com.example.koin.domain.repositories.Repository
import com.example.koin.presentation.MainActivity
import org.koin.dsl.module

val module = module {

    scope<MainActivity> {
        scoped<Interactor> { InteractorImpl(get()) }
    }
    factory<Service> { ServiceImpl() }
    single<Interactor> { InteractorImpl(get()) }
    single<Repository> { RepositoryImpl(get()) }
}
