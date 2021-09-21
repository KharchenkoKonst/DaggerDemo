package com.example.dagger.presentation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.example.dagger.R
import com.example.dagger.R.layout
import com.example.dagger.data.service.Service
import com.example.dagger.di.app.ComponentHolder
import com.example.dagger.presentation.viewmodel.MainViewModel
import com.example.dagger.presentation.viewmodel.ViewModelFactory
import javax.inject.Inject

class FirstActivity : AppCompatActivity() {

    /**
     * Injecting by Provide method
     */
    private val viewModelFactory = ViewModelFactory(ComponentHolder.appComponent.interactor())
    private val viewModel by viewModels<MainViewModel>()

    @Inject
    lateinit var service: Service

    @Inject
    lateinit var serviceCopy: Service


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        /**
         * Injecting by Inject method
         */
        ComponentHolder.firstActivityComponent.inject(this)
        findViewById<TextView>(R.id.first_text_view).text =
            "$service \n $serviceCopy"
    }

    fun onClick(view: android.view.View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}