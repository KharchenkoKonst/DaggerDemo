package com.example.koin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.koin.R.layout
import com.example.koin.domain.repositories.Repository
import com.example.koin.presentation.viewmodel.MainViewModel
import com.example.koin.presentation.viewmodel.ViewModelFactory
import org.koin.core.component.KoinScopeComponent
import org.koin.core.component.createScope
import org.koin.core.component.get
import org.koin.core.scope.Scope

//Отличие dagger и koin (принцип предоставления зависимостей)
//Почему даггер приоритетен для крупных проектов (плюсы/минусы)
//koin квалификатор
//Как заинжектить viewModel
//Как заинжектить кроме get() и конструктора
class MainActivity : AppCompatActivity(), KoinScopeComponent {

    override val scope: Scope by lazy { createScope(this) }

    private val viewModelFactory = ViewModelFactory(scope.get())
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val repository: Repository = get()
        repository.getVoice()
    }
}