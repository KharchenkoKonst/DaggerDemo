package com.example.dagger.domain.interactors

import android.util.Log
import com.example.dagger.domain.repositories.Repository
import javax.inject.Inject

/**
 * Note: If you use @Inject constructor instead of @Module, you have to annotate the class with the scope annotation
 */
class InteractorImpl @Inject constructor(private val repository: Repository) : Interactor {
    init {
        Log.i("daggerDI", "interactor")
    }
}