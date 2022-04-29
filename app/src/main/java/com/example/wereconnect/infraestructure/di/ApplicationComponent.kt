package com.example.wereconnect.infraestructure.di

import android.app.Application
import com.example.wereconnect.home.di.HomeBuilderModule
import com.example.wereconnect.infraestructure.WereConnectApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule

import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        NetworkModule::class,
        HomeBuilderModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(app: WereConnectApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): ApplicationComponent
    }
}