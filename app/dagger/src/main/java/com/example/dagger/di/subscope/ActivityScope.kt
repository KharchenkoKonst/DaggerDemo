package com.example.dagger.di.subscope

import javax.inject.Scope
import kotlin.annotation.AnnotationRetention.RUNTIME

@Scope

//Какие бывают
/**
 * @Retention позволяет указать жизненный цикл аннотации:
 * Будет ли она только в исходном коде (SOURCE)
 * В скомпилированном файле (CLASS{java}/BINARY{kotlin})
 * Видна в процессе выполнения (RUNTIME)
 */
@Retention(RUNTIME)
annotation class ActivityScope