package com.example.daggerbasics.data.service

import android.util.Log
import com.example.daggerbasics.di.subscope.ActivityScope
import com.example.daggerbasics.domain.repositories.Repository
import javax.inject.Inject

class ServiceImpl @Inject constructor(repository: Repository) : Service {
    init {
        repository.showImAlive()
    }

    override fun showImAlive() {
        Log.i("serviceDI", "hello")
    }
}