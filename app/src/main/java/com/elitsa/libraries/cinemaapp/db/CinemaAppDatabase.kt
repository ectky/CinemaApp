package com.elitsa.libraries.cinemaapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.elitsa.libraries.cinemaapp.db.daos.ActorDao
import com.elitsa.libraries.cinemaapp.db.daos.MovieDao
import com.elitsa.libraries.cinemaapp.db.entities.*
import com.elitsa.libraries.cinemaapp.utils.Constants


@Database(entities = [MovieEntity::class, ActorEntity::class], version = Constants.DB_VERSION)
abstract class CinemaAppDatabase: RoomDatabase(){
    abstract fun moviesDao(): MovieDao
    abstract fun actorsDao(): ActorDao
}