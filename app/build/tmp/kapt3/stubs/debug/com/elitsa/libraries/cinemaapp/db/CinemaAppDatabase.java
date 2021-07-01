package com.elitsa.libraries.cinemaapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.elitsa.libraries.cinemaapp.db.daos.ActorDao;
import com.elitsa.libraries.cinemaapp.db.daos.MovieDao;
import com.elitsa.libraries.cinemaapp.db.entities.*;
import com.elitsa.libraries.cinemaapp.utils.Constants;

@androidx.room.Database(entities = {com.elitsa.libraries.cinemaapp.db.entities.MovieEntity.class, com.elitsa.libraries.cinemaapp.db.entities.ActorEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/db/CinemaAppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "actorsDao", "Lcom/elitsa/libraries/cinemaapp/db/daos/ActorDao;", "moviesDao", "Lcom/elitsa/libraries/cinemaapp/db/daos/MovieDao;", "app_debug"})
public abstract class CinemaAppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.elitsa.libraries.cinemaapp.db.daos.MovieDao moviesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.elitsa.libraries.cinemaapp.db.daos.ActorDao actorsDao();
    
    public CinemaAppDatabase() {
        super();
    }
}