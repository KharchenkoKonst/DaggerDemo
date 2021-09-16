package com.example.koin.di

import com.example.koin.data.repository.RepositoryImpl
import com.example.koin.domain.interactor.Interactor
import com.example.koin.domain.interactor.InteractorImpl
import com.example.koin.domain.repository.Repository
import org.koin.dsl.module

val module = module {
    single<Repository> { RepositoryImpl() }
    single<Interactor> { InteractorImpl(get()) }
}
