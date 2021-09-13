package com.example.daggerdemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerdemo.App
import com.example.daggerdemo.DI.components.DaggerAppComponent
import com.example.daggerdemo.R.layout
import com.example.daggerdemo.dependencies.chat_screen_scope.ScreenChatPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
/*
    @Inject
    lateinit var utils1: Utils

    @Inject
    lateinit var utils2: Utils

    @Inject
    lateinit var utilsLazy: Lazy<Utils>*/

    @Inject
    lateinit var presenter: ScreenChatPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
//        doDI()

        App.getApp().plusChatComponent()
        App.getApp().plusScreenChatComponent().inject(this)
        Log.d("tag",presenter::class.java.name)
    }

/*
    private fun doDI() {
        DaggerAppComponent.create().inject(this)

        val dataUtils1 = utils1.getDataUtils()
        val networkUtils1 = utils1.getNetworkUtils()
        dataUtils1.compute()
        networkUtils1.workingWithNetwork()

        val dataUtils2 = utils2.getDataUtils()
        val networkUtils2 = utils2.getNetworkUtils()
        dataUtils2.compute()
        networkUtils2.workingWithNetwork()

        val utilsByLazy = utilsLazy.get()
        val utilsByLazyCopy = utilsLazy.get()
    }
*/
}