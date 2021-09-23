package com.example.koin.data.service

import android.util.Log

class Service2Impl : Service {
    override fun getVoice() {
        Log.i("koinDI", "service 2")
    }
}