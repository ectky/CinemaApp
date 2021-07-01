package com.elitsa.libraries.cinemaapp.db.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors
@Dao
interface MovieDao {
    @Insert
    suspend fun saveMovie(movie: MovieEntity)

    @Delete
    suspend fun removeMovie(movie: MovieEntity)

    @Query("SELECT * FROM movieentity")
    suspend fun getSavedMovieEntities(): List<MovieEntity>

    @Query("SELECT * FROM movieentity WHERE id LIKE :movieId LIMIT 1")
    suspend fun getSavedMovie(movieId: Int): MovieEntity

    @Transaction
    @Query("SELECT * FROM movieentity")
    fun getMoviesWithActors(): LiveData<List<MovieWithActors>>
}