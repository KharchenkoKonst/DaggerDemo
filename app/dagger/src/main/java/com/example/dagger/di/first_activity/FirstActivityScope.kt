package com.example.dagger.di.first_activity

import javax.inject.Scope
import kotlin.annotation.AnnotationRetention.RUNTIME

/**
 * Виды Retention:
 * @Retention позволяет указать жизненный цикл аннотации:
 * Будет ли она только в исходном коде (SOURCE)
 * В скомпилированном файле (CLASS{java}/BINARY{kotlin})
 * Видна в процессе выполнения (RUNTIME)
 */
@Scope
@Retention(RUNTIME)
annotation class FirstActivityScope