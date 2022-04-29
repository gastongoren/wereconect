package com.example.wereconnect.home.di

import com.example.wereconnect.home.presentation.view.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
abstract class HomeBuilderModule {

    @ContributesAndroidInjector(
        modules = [
            HomeModule::class,
            HomeDataSourceModule::class
        ]
    )
    internal abstract fun provideMainActivity(): HomeActivity
}