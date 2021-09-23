package com.example.koin.di

import com.example.koin.data.repositories.RepositoryImpl
import com.example.koin.data.service.Service
import com.example.koin.data.service.Service1Impl
import com.example.koin.data.service.Service2Impl
import com.example.koin.domain.interactors.Interactor
import com.example.koin.domain.interactors.InteractorImpl
import com.example.koin.domain.repositories.Repository
import com.example.koin.presentation.MainActivity
import com.example.koin.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val module = module {

    scope<MainActivity> {
        scoped<Interactor> { InteractorImpl(get()) }
    }
    factory<Service>(named("service1")) { Service1Impl() }
    factory<Service>(named("service2")) { Service2Impl() }
    single<Interactor> { InteractorImpl(get()) }
    single<Repository> { RepositoryImpl(get(qualifier = named("service1"))) }
    viewModel { MainViewModel(get()) }
}
