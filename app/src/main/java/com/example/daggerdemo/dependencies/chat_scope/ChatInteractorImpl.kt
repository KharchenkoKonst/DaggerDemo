package com.example.daggerdemo.dependencies.chat_scope

import com.example.daggerdemo.dependencies.app_scope.Utils
import javax.inject.Inject

class ChatInteractorImpl @Inject constructor(private val utils: Utils) : ChatInteractor {
}