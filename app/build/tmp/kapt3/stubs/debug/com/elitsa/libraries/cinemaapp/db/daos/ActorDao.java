package com.elitsa.libraries.cinemaapp.db.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/db/daos/ActorDao;", "", "deleteActor", "", "actor", "Lcom/elitsa/libraries/cinemaapp/db/entities/ActorEntity;", "(Lcom/elitsa/libraries/cinemaapp/db/entities/ActorEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteActorsOfMovie", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActors", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveActors", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ActorDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM actorentity")
    public abstract java.lang.Object getActors(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elitsa.libraries.cinemaapp.db.entities.ActorEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object saveActors(@org.jetbrains.annotations.NotNull()
    java.util.List<com.elitsa.libraries.cinemaapp.db.entities.ActorEntity> actor, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteActor(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.db.entities.ActorEntity actor, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM actorentity WHERE movie_id LIKE :movieId")
    public abstract java.lang.Object deleteActorsOfMovie(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}