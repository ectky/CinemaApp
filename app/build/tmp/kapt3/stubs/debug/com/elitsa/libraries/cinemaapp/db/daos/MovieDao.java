package com.elitsa.libraries.cinemaapp.db.daos;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity;
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity;
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/db/daos/MovieDao;", "", "getMoviesWithActors", "Landroidx/lifecycle/LiveData;", "", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieWithActors;", "getSavedMovie", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieEntity;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedMovieEntities", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeMovie", "", "movie", "(Lcom/elitsa/libraries/cinemaapp/db/entities/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovie", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object saveMovie(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.db.entities.MovieEntity movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeMovie(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.db.entities.MovieEntity movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM movieentity")
    public abstract java.lang.Object getSavedMovieEntities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM movieentity WHERE id LIKE :movieId LIMIT 1")
    public abstract java.lang.Object getSavedMovie(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.db.entities.MovieEntity> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movieentity")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors>> getMoviesWithActors();
}