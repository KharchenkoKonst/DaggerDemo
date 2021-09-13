package com.example.daggerdemo.DI.components

import com.example.daggerdemo.DI.modules.ChatModule
import com.example.daggerdemo.DI.scopes.ChatScope
import com.example.daggerdemo.dependencies.app_scope.Utils
import com.example.daggerdemo.dependencies.chat_scope.ChatInteractor
import dagger.Component

@Component(modules = [ChatModule::class], dependencies = [AppComponent::class])
@ChatScope
interface ChatComponent {

    val utils: Utils
    val interactor: ChatInteractor
}