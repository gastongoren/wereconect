package com.example.wereconnect.home.data.remote

import com.example.wereconnect.home.domain.domainModel.MovieResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

interface MoviesApi {
    @GET("/lookup")
    suspend fun getMovies(@Query("term") term: String): MovieResponse

    @GET("/idlookup")
    suspend fun getMoviesById(
        @Query("source_id") sourceId: String,
        @Query("source") source: String = "imdb"
    ): MovieResponse
}

class MoviesApiService @Inject constructor(retrofit: Retrofit) : MoviesApi {

    private val moviesApi = retrofit.create(MoviesApi::class.java)

    override suspend fun getMovies(term: String): MovieResponse = moviesApi.getMovies(term)


    override suspend fun getMoviesById(sourceId: String, source: String): MovieResponse {
        return moviesApi.getMoviesById(sourceId)
    }
}