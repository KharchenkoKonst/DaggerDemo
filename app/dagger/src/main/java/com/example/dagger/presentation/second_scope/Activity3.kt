package com.example.dagger.presentation.second_scope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.dagger.R
import com.example.dagger.data.service.Service
import com.example.dagger.di.app.ComponentHolder
import com.example.dagger.di.custom_qualifier.CustomName
import com.example.dagger.di.custom_qualifier.EnumQualifiers.FirstQualifier
import com.example.dagger.di.custom_qualifier.EnumQualifiers.SecondQualifier
import javax.inject.Inject

class Activity3 : AppCompatActivity() {

    @CustomName(FirstQualifier)
    @Inject
    lateinit var service: Service

    @CustomName(SecondQualifier)
    @Inject
    lateinit var serviceCopy: Service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        ComponentHolder.secondActivityComponent.inject(this)

        findViewById<TextView>(R.id.third_text_view).text =
            "$service \n $serviceCopy"
    }
}