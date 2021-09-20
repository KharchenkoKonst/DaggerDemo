package com.example.dagger.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.dagger.R
import com.example.dagger.data.service.Service
import com.example.dagger.di.app.ComponentHolder
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var service: Service

    @Inject
    lateinit var serviceCopy: Service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        ComponentHolder.secondActivityComponent.inject(this)

        /**
         * Demonstrate of Scope's work
         */
        findViewById<TextView>(R.id.second_text_view).text =
            "$service \n $serviceCopy"
    }
}