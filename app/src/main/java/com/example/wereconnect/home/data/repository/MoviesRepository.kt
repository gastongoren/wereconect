package com.example.wereconnect.home.data.repository

import com.example.wereconnect.home.domain.domainModel.MovieResponse

interface MoviesRepository {
    suspend fun getMovies (term: String): MovieResponse
    suspend fun getMovieById (movieId: String): MovieResponse
}