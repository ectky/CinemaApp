package com.elitsa.libraries.cinemaapp.app.network.models.movie_list;

import com.squareup.moshi.Json;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_list/MovieListResponse;", "", "page", "", "results", "", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_list/MovieShortDetail;", "totalPages", "totalResults", "(ILjava/util/List;II)V", "getPage", "()I", "getResults", "()Ljava/util/List;", "getTotalPages", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MovieListResponse {
    private final int page = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail> results = null;
    private final int totalPages = 0;
    private final int totalResults = 0;
    
    public final int getPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail> getResults() {
        return null;
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public MovieListResponse(@com.squareup.moshi.Json(name = "page")
    int page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "results")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail> results, @com.squareup.moshi.Json(name = "total_pages")
    int totalPages, @com.squareup.moshi.Json(name = "total_results")
    int totalResults) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse copy(@com.squareup.moshi.Json(name = "page")
    int page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "results")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail> results, @com.squareup.moshi.Json(name = "total_pages")
    int totalPages, @com.squareup.moshi.Json(name = "total_results")
    int totalResults) {
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