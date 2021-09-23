package com.example.koin.data.service

import android.util.Log
import org.koin.core.component.KoinScopeComponent
import org.koin.core.component.createScope
import org.koin.core.scope.Scope

class Service1Impl() : Service {
    override fun getVoice() {
        Log.i("koinDI", "service 1")
    }
}