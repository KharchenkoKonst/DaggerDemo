package com.example.daggerbasics.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerbasics.domain.interactors.Interactor

class ViewModelFactory(private val interactor: Interactor) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = MainViewModel(interactor) as T
}