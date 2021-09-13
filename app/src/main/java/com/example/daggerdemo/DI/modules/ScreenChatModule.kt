package com.example.daggerdemo.DI.modules

import com.example.daggerdemo.DI.scopes.ScreenChatScope
import com.example.daggerdemo.dependencies.app_scope.Utils
import com.example.daggerdemo.dependencies.chat_scope.ChatInteractor
import com.example.daggerdemo.dependencies.chat_screen_scope.ScreenChatPresenter
import com.example.daggerdemo.dependencies.chat_screen_scope.ScreenChatPresenterImpl
import dagger.Module
import dagger.Provides

@Module
class ScreenChatModule {

    @Provides
    @ScreenChatScope
    fun provideScreenChatPresenter(utils: Utils, interactor: ChatInteractor): ScreenChatPresenter =
        ScreenChatPresenterImpl(utils, interactor)
}