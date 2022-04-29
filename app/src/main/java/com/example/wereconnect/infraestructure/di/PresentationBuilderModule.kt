package com.example.wereconnect.infraestructure.di

import androidx.lifecycle.ViewModel
import com.example.wereconnect.home.presentation.view.HomeActivity
import com.example.wereconnect.home.presentation.viewModel.SearchMoviesViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class PresentationBuilderModule {


    @ContributesAndroidInjector
    abstract fun provideMainActivity(): HomeActivity

    @Binds
    @IntoMap
    @ViewModelKey(SearchMoviesViewModel::class)
    abstract fun providePaperworkActiveViewModel(paperworkActiveViewModel: SearchMoviesViewModel): ViewModel
}