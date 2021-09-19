package com.example.koin.data.repositories

import android.util.Log
import com.example.koin.data.service.Service
import com.example.koin.domain.repositories.Repository

class RepositoryImpl(private val service: Service) : Repository {

    override fun getVoice() {
        Log.i("koinDI", "repository")
        service.getVoice()
    }
}