package com.example.daggerbasics.domain.interactors

import com.example.daggerbasics.domain.repositories.Repository
import javax.inject.Inject

class InteractorImpl @Inject constructor(private val repository: Repository) : Interactor {
    init {
        repository.showImAlive()
    }
}