package com.example.dagger_subcomponents.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger_subcomponents.R.layout
import com.example.dagger_subcomponents.data.SubDependency
import com.example.dagger_subcomponents.di.ComponentHolder
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var subDependency: SubDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        ComponentHolder.subDependencyComponent.inject(this)
        Log.i("subComponentDI", "$subDependency")
    }
}