package com.example.dagger.di.second_activity

import com.example.dagger.di.app.AppComponent
import com.example.dagger.presentation.view.SecondActivity
import dagger.Component

@SecondActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [SecondActivityModule::class]
)
interface SecondActivityComponent {

    fun inject(activity: SecondActivity)
}
