package com.example.daggerbasics.di.subscope

import com.example.daggerbasics.di.AppComponent
import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [SubScopeModule::class])
interface SubScopeComponent {
}