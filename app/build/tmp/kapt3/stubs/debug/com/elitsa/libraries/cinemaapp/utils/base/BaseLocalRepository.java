package com.elitsa.libraries.cinemaapp.utils.base;

import com.elitsa.libraries.cinemaapp.app.CinemaApp;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/utils/base/BaseLocalRepository;", "", "()V", "database", "Lcom/elitsa/libraries/cinemaapp/db/CinemaAppDatabase;", "getDatabase", "()Lcom/elitsa/libraries/cinemaapp/db/CinemaAppDatabase;", "app_debug"})
public abstract class BaseLocalRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.elitsa.libraries.cinemaapp.db.CinemaAppDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.elitsa.libraries.cinemaapp.db.CinemaAppDatabase getDatabase() {
        return null;
    }
    
    public BaseLocalRepository() {
        super();
    }
}