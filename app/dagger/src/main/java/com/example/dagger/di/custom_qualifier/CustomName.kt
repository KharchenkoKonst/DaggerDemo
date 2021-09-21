package com.example.dagger.di.custom_qualifier

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@MustBeDocumented
@Retention(RUNTIME)
annotation class CustomName(val qualifier: EnumQualifiers)
