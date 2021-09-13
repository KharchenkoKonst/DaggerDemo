package com.example.daggerdemo.DI.components

import com.example.daggerdemo.DI.modules.ScreenChatModule
import com.example.daggerdemo.DI.scopes.ScreenChatScope
import com.example.daggerdemo.view.MainActivity
import dagger.Component

@Component(modules = [ScreenChatModule::class], dependencies = [ChatComponent::class])
@ScreenChatScope
interface ScreenChatComponent {

    fun inject(mainActivity: MainActivity)
}