package com.example.daggerdemo.DI.modules

import com.example.daggerdemo.dependencies.app_scope.Utils
import com.example.daggerdemo.dependencies.app_scope.data_utils.DataUtils
import com.example.daggerdemo.dependencies.app_scope.data_utils.DataUtilsImpl
import com.example.daggerdemo.dependencies.app_scope.network_utils.NetworkUtils
import com.example.daggerdemo.dependencies.app_scope.network_utils.NetworkUtilsCloudImpl
import com.example.daggerdemo.dependencies.app_scope.network_utils.NetworkUtilsLocalImpl
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun providerDataUtils(): DataUtils = DataUtilsImpl()

    @Provides
    @Named("Local")
    fun providerNetworkUtilsLocal(): NetworkUtils = NetworkUtilsLocalImpl()

    @Provides
    @Named("Cloud")
    fun providerNetworkUtilsCloud(): NetworkUtils = NetworkUtilsCloudImpl()

    @Provides
    @Singleton
    fun providerUtils(dataUtils: DataUtils, @Named("Cloud") networkUtils: NetworkUtils) = Utils(dataUtils, networkUtils)
}