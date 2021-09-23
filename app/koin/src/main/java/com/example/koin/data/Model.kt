package com.example.koin.data

import com.example.koin.data.service.Service
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject
import org.koin.core.qualifier.named

class Model : KoinComponent {
    val service1: Service by inject(qualifier = named("service1"))
    val service2: Service by inject(qualifier = named("service2"))
}