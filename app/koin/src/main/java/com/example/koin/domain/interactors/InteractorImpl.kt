package com.example.koin.domain.interactors

import android.util.Log
import com.example.koin.data.service.Service
import com.example.koin.domain.repositories.Repository
import org.koin.core.component.KoinScopeComponent
import org.koin.core.component.createScope
import org.koin.core.scope.Scope

class InteractorImpl(private val repository: Repository) : Interactor {

    init {
        getVoice()
    }

    override fun getVoice() {
        Log.i("koinDI", "interactor")
        repository.getVoice()
    }
}