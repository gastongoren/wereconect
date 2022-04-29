package com.example.wereconnect.home.domain.useCases

import com.example.wereconnect.home.data.repository.MoviesRepository
import com.example.wereconnect.home.domain.domainModel.MovieResponse
import javax.inject.Inject

class MoviesUseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {

    suspend fun getMovies(term: String): MovieResponse = moviesRepository.getMovies(term)


    suspend fun getMoviesById(id: String): MovieResponse = moviesRepository.getMovieById(id)

}