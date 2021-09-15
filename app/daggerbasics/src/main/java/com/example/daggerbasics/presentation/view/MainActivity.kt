package com.example.daggerbasics.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.daggerbasics.R.layout
import com.example.daggerbasics.data.service.Service
import com.example.daggerbasics.di.ComponentHolder
import com.example.daggerbasics.presentation.viewmodel.MainViewModel
import com.example.daggerbasics.presentation.viewmodel.ViewModelFactory
import javax.inject.Inject

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