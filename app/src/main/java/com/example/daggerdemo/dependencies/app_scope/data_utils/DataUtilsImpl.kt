package com.example.daggerdemo.dependencies.app_scope.data_utils

import javax.inject.Inject

class DataUtilsImpl @Inject constructor() : DataUtils {

    override fun compute() {
        println("computation")
    }
}