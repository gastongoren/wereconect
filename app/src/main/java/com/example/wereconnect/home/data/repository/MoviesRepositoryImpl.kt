package com.example.wereconnect.home.data.repository

import com.example.wereconnect.home.data.remote.MoviesApi
import com.example.wereconnect.home.domain.domainModel.MovieResponse
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(private val moviesApiService: MoviesApi): MoviesRepository {
    override suspend fun getMovies(term: String): MovieResponse {
        return moviesApiService.getMovies(term)
    }

    override suspend fun getMovieById(movieId: String): MovieResponse {
       return moviesApiService.getMoviesById(movieId)
    }
}