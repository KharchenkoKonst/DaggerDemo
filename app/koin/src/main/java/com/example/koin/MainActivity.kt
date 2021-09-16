package com.example.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koin.domain.interactor.Interactor
import com.example.koin.domain.interactor.InteractorImpl
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val interactor: Interactor by inject()
        interactor.getVoice()
    }
}