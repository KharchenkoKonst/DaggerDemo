package com.example.daggerdemo

import android.app.Application
import com.example.daggerdemo.DI.components.AppComponent
import com.example.daggerdemo.DI.components.ChatComponent
import com.example.daggerdemo.DI.components.DaggerAppComponent
import com.example.daggerdemo.DI.components.DaggerChatComponent
import com.example.daggerdemo.DI.components.DaggerScreenChatComponent
import com.example.daggerdemo.DI.components.ScreenChatComponent
import javax.inject.Inject

class App : Application() {

    private lateinit var appComponent: AppComponent
    private var chatComponent: ChatComponent? = null
    private var screenChatComponent: ScreenChatComponent? = null

    override fun onCreate() {
        super.onCreate()
        instance = this

        appComponent = DaggerAppComponent.create()
    }

    fun plusChatComponent(): ChatComponent {
        if (chatComponent == null) {
            chatComponent = DaggerChatComponent.builder()
                .appComponent(appComponent)
                .build()
        }
        return chatComponent!!
    }

    fun clearChatComponent() {
        if (chatComponent != null) {
            chatComponent = null
        }
    }

    fun plusScreenChatComponent(): ScreenChatComponent {
        if (screenChatComponent == null) {
            screenChatComponent = DaggerScreenChatComponent.builder()
                .chatComponent(chatComponent)
                .build()
        }
        return screenChatComponent!!
    }

    companion object {

        private lateinit var instance: App
        fun getApp() = instance
    }
}