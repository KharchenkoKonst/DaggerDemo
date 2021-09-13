package com.example.daggerbasics.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.daggerbasics.R.layout
import com.example.daggerbasics.di.ComponentHolder
import com.example.daggerbasics.presentation.viewmodel.MainViewModel
import com.example.daggerbasics.presentation.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity() {

    private val viewModelFactory = ViewModelFactory(ComponentHolder.getAppComponent().getInteractor())
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }
}