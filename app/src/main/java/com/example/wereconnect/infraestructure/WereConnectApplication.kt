package com.example.wereconnect.infraestructure

import com.example.wereconnect.infraestructure.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class WereConnectApplication : DaggerApplication() {


    companion object {
        lateinit var instance: WereConnectApplication
    }

    override fun onCreate() {
        instance = this
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerApplicationComponent.builder()
            .application(this)
            .build()
        appComponent.inject(this)
        return appComponent
    }
}