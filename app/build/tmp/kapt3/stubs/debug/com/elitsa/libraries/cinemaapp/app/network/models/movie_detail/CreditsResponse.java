package com.elitsa.libraries.cinemaapp.app.network.models.movie_detail;

import com.squareup.moshi.Json;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/CreditsResponse;", "", "cast", "", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/ActorResponse;", "crew", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/CrewResponse;", "(Ljava/util/List;Ljava/util/List;)V", "getCast", "()Ljava/util/List;", "getCrew", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class CreditsResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse> cast = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CrewResponse> crew = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse> getCast() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CrewResponse> getCrew() {
        return null;
    }
    
    public CreditsResponse(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cast")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse> cast, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "crew")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CrewResponse> crew) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CrewResponse> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CreditsResponse copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cast")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse> cast, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "crew")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CrewResponse> crew) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}