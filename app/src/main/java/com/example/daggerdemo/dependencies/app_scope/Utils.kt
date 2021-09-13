package com.example.daggerdemo.dependencies.app_scope

import com.example.daggerdemo.dependencies.app_scope.data_utils.DataUtils
import com.example.daggerdemo.dependencies.app_scope.network_utils.NetworkUtils
import javax.inject.Inject

class Utils @Inject constructor(
    private val dataUtils: DataUtils,
    private val networkUtils: NetworkUtils
) {

    fun getDataUtils() = dataUtils
    fun getNetworkUtils() = networkUtils
}