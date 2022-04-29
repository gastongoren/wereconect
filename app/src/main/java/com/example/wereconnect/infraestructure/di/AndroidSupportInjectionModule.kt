package com.example.wereconnect.infraestructure.di

import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.internal.Beta

@Beta
@Module(includes = [AndroidInjectionModule::class])
abstract class AndroidSupportInjectionModule private constructor()
