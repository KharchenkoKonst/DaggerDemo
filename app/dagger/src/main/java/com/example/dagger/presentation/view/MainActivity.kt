package com.example.dagger.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.dagger.R.layout
import com.example.dagger.data.service.Service
import com.example.dagger.di.ComponentHolder
import com.example.dagger.presentation.viewmodel.MainViewModel
import com.example.dagger.presentation.viewmodel.ViewModelFactory
import javax.inject.Inject

//Показать работу скоупа
//generated классы как работают
//добавить квалификаторы (2 способа описания)
//subcomponents
//можно ли управлять жизненным циклом через scope
class MainActivity : AppCompatActivity() {

    private val viewModelFactory = ViewModelFactory(ComponentHolder.appComponent.interactor())
    private val viewModel by viewModels<MainViewModel>()

    @Inject
    lateinit var service: Service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        ComponentHolder.activityComponent.inject(this)
        service.showImAlive()

    }
}