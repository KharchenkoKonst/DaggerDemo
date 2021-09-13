package com.example.daggerdemo.dependencies.app_scope.network_utils

import javax.inject.Inject

class NetworkUtilsLocalImpl @Inject constructor() : NetworkUtils {

    override fun workingWithNetwork() {
        println("working with network by local")
    }
}