package com.example.wereconnect.home.di

import androidx.lifecycle.ViewModel
import com.example.wereconnect.home.presentation.viewModel.SearchMoviesViewModel
import com.example.wereconnect.infraestructure.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeModule {

    @Binds
    @IntoMap
    @ViewModelKey(SearchMoviesViewModel::class)
    abstract fun providePaperworkActiveViewModel(paperworkActiveViewModel: SearchMoviesViewModel): ViewModel
}