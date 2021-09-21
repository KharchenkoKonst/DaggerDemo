package com.example.dagger.presentation.first_scope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.dagger.R
import com.example.dagger.data.service.Service
import com.example.dagger.di.app.ComponentHolder
import javax.inject.Inject
import javax.inject.Named

class Activity2 : AppCompatActivity() {

    @Named("FirstService")
    @Inject
    lateinit var service: Service

    @Named("SecondService")
    @Inject
    lateinit var serviceCopy: Service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        ComponentHolder.firstActivityComponent.inject(this)

        findViewById<TextView>(R.id.second_text_view).text =
            "$service \n $serviceCopy"
    }

    fun onClick(view: android.view.View) {
        startActivity(Intent(this, Activity1::class.java))
    }
}