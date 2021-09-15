package com.example.daggerbasics.domain.interactors

import com.example.daggerbasics.domain.repositories.Repository
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Note: If you use @Inject constructor instead of @Module, you have to annotate the class with the scope annotation
 */
class InteractorImpl @Inject constructor(private val repository: Repository) : Interactor {

    init {
        repository.showImAlive()
    }
}