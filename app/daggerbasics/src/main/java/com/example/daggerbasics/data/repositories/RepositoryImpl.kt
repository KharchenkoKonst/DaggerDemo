package com.example.daggerbasics.data.repositories

import android.util.Log
import com.example.daggerbasics.domain.repositories.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor() : Repository {

    override fun showImAlive() {
        Log.i("DI", "repository do useful work")
    }
}