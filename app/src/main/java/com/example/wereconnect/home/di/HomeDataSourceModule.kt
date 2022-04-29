package com.example.wereconnect.home.di

import com.example.wereconnect.home.data.repository.MoviesRepository
import com.example.wereconnect.home.data.repository.MoviesRepositoryImpl
import com.example.wereconnect.home.data.remote.MoviesApiService
import dagger.Module
import dagger.Provides

@Module
class HomeDataSourceModule {
    @Provides
    fun providesRepository(moviesApiService: MoviesApiService): MoviesRepository {
        return MoviesRepositoryImpl(moviesApiService)
    }
}