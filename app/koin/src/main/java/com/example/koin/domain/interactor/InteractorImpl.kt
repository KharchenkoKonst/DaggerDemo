package com.example.koin.domain.interactor

import com.example.koin.data.repository.RepositoryImpl
import com.example.koin.domain.repository.Repository

class InteractorImpl(private val repository: Repository) : Interactor {

    override fun getVoice() {
        repository.getVoice()
    }
}