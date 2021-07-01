package com.elitsa.libraries.cinemaapp.db.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity
@Dao
interface ActorDao {
    @Query("SELECT * FROM actorentity")
    suspend fun getActors(): List<ActorEntity>

    @Insert
    suspend fun saveActors(actor: List<ActorEntity>)

    @Delete
    suspend fun deleteActor(actor: ActorEntity)

    @Query("DELETE FROM actorentity WHERE movie_id LIKE :movieId")
    suspend fun deleteActorsOfMovie(movieId: Int)
}