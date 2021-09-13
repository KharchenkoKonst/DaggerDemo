package com.example.daggerdemo.DI.modules

import com.example.daggerdemo.DI.scopes.ChatScope
import com.example.daggerdemo.dependencies.app_scope.Utils
import com.example.daggerdemo.dependencies.chat_scope.ChatInteractor
import com.example.daggerdemo.dependencies.chat_scope.ChatInteractorImpl
import com.example.daggerdemo.dependencies.chat_scope.ChatSateController
import com.example.daggerdemo.dependencies.chat_scope.ChatStateControllerImpl
import dagger.Module
import dagger.Provides

@Module
class ChatModule {

    @Provides
    @ChatScope
    fun provideChatInteractor(utils: Utils): ChatInteractor = ChatInteractorImpl(utils)

    @Provides
    @ChatScope
    fun provideChatStateController(): ChatSateController = ChatStateControllerImpl()
}