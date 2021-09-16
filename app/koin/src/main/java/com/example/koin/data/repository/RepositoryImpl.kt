package com.example.koin.data.repository

import android.util.Log
import com.example.koin.domain.repository.Repository

class RepositoryImpl : Repository {

    override fun getVoice() {
        Log.i("koinRepo", "repository works")
    }
}