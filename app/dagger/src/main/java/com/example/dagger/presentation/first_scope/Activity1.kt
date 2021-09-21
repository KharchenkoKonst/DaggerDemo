package com.example.dagger.presentation.first_scope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.example.dagger.R
import com.example.dagger.R.layout
import com.example.dagger.data.service.Service
import com.example.dagger.di.app.ComponentHolder
import com.example.dagger.presentation.second_scope.Activity3
import com.example.dagger.presentation.viewmodel.MainViewModel
import com.example.dagger.presentation.viewmodel.ViewModelFactory
import javax.inject.Inject
import javax.inject.Named

class Activity1 : AppCompatActivity() {

    /**
     * Injecting by Provide method
     */
    private val viewModelFactory = ViewModelFactory(ComponentHolder.appComponent.interactor())
    private val viewModel by viewModels<MainViewModel>()

    @Named("FirstService")
    @Inject
    lateinit var service: Service

    @Named("SecondService")
    @Inject
    lateinit var serviceCopy: Service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_1)

        /**
         * Injecting by Inject method
         */
        ComponentHolder.firstActivityComponent.inject(this)
        findViewById<TextView>(R.id.first_text_view).text =
            "$service \n $serviceCopy"
    }

    fun onSecondActivityClick(view: android.view.View) {
        startActivity(Intent(this, Activity2::class.java))
    }

    fun onThirdActivityClick(view: android.view.View) {
        startActivity(Intent(this, Activity3::class.java))
    }
}