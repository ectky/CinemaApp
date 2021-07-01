package com.elitsa.libraries.cinemaapp.app.network.models.movie_list;

import com.squareup.moshi.Json;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0001\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0015J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u00101\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00b8\u0001\u0010:\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0003\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0012\u001a\u00020\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\bH\u00d6\u0001J\t\u0010?\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b(\u0010\"R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*\u00a8\u0006@"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_list/MovieShortDetail;", "", "adult", "", "backdropPath", "", "genreIds", "", "", "id", "originalLanguage", "originalTitle", "overview", "popularity", "", "posterPath", "releaseDate", "title", "video", "voteAverage", "voteCount", "(ZLjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/Integer;)V", "getAdult", "()Z", "getBackdropPath", "()Ljava/lang/String;", "getGenreIds", "()Ljava/util/List;", "getId", "()I", "getOriginalLanguage", "getOriginalTitle", "getOverview", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPosterPath", "getReleaseDate", "getTitle", "getVideo", "getVoteAverage", "getVoteCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/Integer;)Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_list/MovieShortDetail;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MovieShortDetail {
    private final boolean adult = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String backdropPath = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Integer> genreIds = null;
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalLanguage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalTitle = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double popularity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String posterPath = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    private final boolean video = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double voteAverage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer voteCount = null;
    
    public final boolean getAdult() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getGenreIds() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final boolean getVideo() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVoteAverage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    public MovieShortDetail(@com.squareup.moshi.Json(name = "adult")
    boolean adult, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "genre_ids")
    java.util.List<java.lang.Integer> genreIds, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "original_language")
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "original_title")
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "popularity")
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @com.squareup.moshi.Json(name = "video")
    boolean video, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_average")
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_count")
    java.lang.Integer voteCount) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail copy(@com.squareup.moshi.Json(name = "adult")
    boolean adult, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "genre_ids")
    java.util.List<java.lang.Integer> genreIds, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "original_language")
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "original_title")
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "popularity")
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @com.squareup.moshi.Json(name = "video")
    boolean video, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_average")
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_count")
    java.lang.Integer voteCount) {
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