package com.example.daggerdemo.dependencies.chat_screen_scope

import android.util.Log
import com.example.daggerdemo.dependencies.app_scope.Utils
import com.example.daggerdemo.dependencies.chat_scope.ChatInteractor
import javax.inject.Inject

class ScreenChatPresenterImpl @Inject constructor(
    private val utils: Utils,
    private val interactor: ChatInteractor
) :
    ScreenChatPresenter {

    init {
        Log.d("daggerTest", utils::class.java.name)
    }
}