package com.example.dagger.data.repositories

import android.util.Log
import com.example.dagger.domain.repositories.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor() : Repository {

    override fun showImAlive() {
        Log.i("DI", "repository do useful work")
    }
}