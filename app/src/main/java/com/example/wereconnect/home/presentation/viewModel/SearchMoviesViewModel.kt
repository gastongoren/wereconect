package com.example.wereconnect.home.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wereconnect.home.data.repository.MoviesRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class SearchMoviesViewModel @Inject constructor(private val moviesRepository: MoviesRepository) :
    ViewModel() {
    fun setup() {
        viewModelScope.launch {
            val movies = moviesRepository.getMovies("batman")
            movies.results.forEach {
                it.name
            }
        }
    }
}