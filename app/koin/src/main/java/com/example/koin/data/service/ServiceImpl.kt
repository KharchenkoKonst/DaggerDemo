package com.example.koin.data.service

import android.util.Log
import org.koin.core.component.KoinScopeComponent
import org.koin.core.component.createScope
import org.koin.core.scope.Scope

class ServiceImpl() : Service {


    override fun getVoice() {
        Log.i("koinDI", "service")
    }
}