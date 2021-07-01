package com.elitsa.libraries.cinemaapp.app.network.models.movie_detail;

import com.squareup.moshi.Json;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bJ\b\u0086\b\u0018\u00002\u00020\u0001B\u00cf\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0012\b\u0001\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0010\u001a\u00020\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0001\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\r\u0012\u0012\b\u0001\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\r\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u001d\u001a\u00020\t\u0012\b\b\u0003\u0010\u001e\u001a\u00020\t\u0012\u0012\b\u0001\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\r\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010$\u001a\u00020\u0003\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0003\u0010&\u001a\u00020\t\u00a2\u0006\u0002\u0010\'J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\rH\u00c6\u0003J\u0013\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\rH\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\tH\u00c6\u0003J\t\u0010T\u001a\u00020\tH\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\rH\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\t\u0010\\\u001a\u00020\tH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010^\u001a\u00020\tH\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0013\u0010`\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\tH\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00d8\u0002\u0010d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0003\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0010\u001a\u00020\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0012\b\u0003\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\r2\u0012\b\u0003\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\r2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u001d\u001a\u00020\t2\b\b\u0003\u0010\u001e\u001a\u00020\t2\u0012\b\u0003\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\r2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010$\u001a\u00020\u00032\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00162\b\b\u0003\u0010&\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010eJ\u0013\u0010f\u001a\u00020\u00032\b\u0010g\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010h\u001a\u00020\tH\u00d6\u0001J\t\u0010i\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001b\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u001b\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u001b\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\u001d\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010/R\u0011\u0010\u001e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010/R\u001b\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\u0013\u0010#\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0015\u0010%\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0002\u0010<\u001a\u0004\bH\u0010;R\u0011\u0010&\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010/\u00a8\u0006j"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/MovieDetailResponse;", "", "adult", "", "backdropPath", "", "belongsToCollection", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/BelongsToCollection;", "budget", "", "credits", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/CreditsResponse;", "genres", "", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/GenreResponse;", "homepage", "id", "imdbId", "originalLanguage", "originalTitle", "overview", "popularity", "", "posterPath", "productionCompanies", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/ProductionCompany;", "productionCountries", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/ProductionCountry;", "releaseDate", "revenue", "runtime", "spokenLanguages", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/SpokenLanguage;", "status", "tagline", "title", "video", "voteAverage", "voteCount", "(ZLjava/lang/String;Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/BelongsToCollection;ILcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/CreditsResponse;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Double;I)V", "getAdult", "()Z", "getBackdropPath", "()Ljava/lang/String;", "getBelongsToCollection", "()Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/BelongsToCollection;", "getBudget", "()I", "getCredits", "()Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/CreditsResponse;", "getGenres", "()Ljava/util/List;", "getHomepage", "getId", "getImdbId", "getOriginalLanguage", "getOriginalTitle", "getOverview", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPosterPath", "getProductionCompanies", "getProductionCountries", "getReleaseDate", "getRevenue", "getRuntime", "getSpokenLanguages", "getStatus", "getTagline", "getTitle", "getVideo", "getVoteAverage", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/BelongsToCollection;ILcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/CreditsResponse;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Double;I)Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/MovieDetailResponse;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MovieDetailResponse {
    private final boolean adult = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String backdropPath = null;
    @org.jetbrains.annotations.Nullable()
    private final com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.BelongsToCollection belongsToCollection = null;
    private final int budget = 0;
    @org.jetbrains.annotations.Nullable()
    private final com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CreditsResponse credits = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.GenreResponse> genres = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String homepage = null;
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String imdbId = null;
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
    private final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCompany> productionCompanies = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCountry> productionCountries = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String releaseDate = null;
    private final int revenue = 0;
    private final int runtime = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.SpokenLanguage> spokenLanguages = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tagline = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    private final boolean video = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double voteAverage = null;
    private final int voteCount = 0;
    
    public final boolean getAdult() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.BelongsToCollection getBelongsToCollection() {
        return null;
    }
    
    public final int getBudget() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CreditsResponse getCredits() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.GenreResponse> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
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
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCompany> getProductionCompanies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCountry> getProductionCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final int getRevenue() {
        return 0;
    }
    
    public final int getRuntime() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.SpokenLanguage> getSpokenLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagline() {
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
    
    public final int getVoteCount() {
        return 0;
    }
    
    public MovieDetailResponse(@com.squareup.moshi.Json(name = "adult")
    boolean adult, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "belongs_to_collection")
    com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.BelongsToCollection belongsToCollection, @com.squareup.moshi.Json(name = "budget")
    int budget, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "credits")
    com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CreditsResponse credits, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "genres")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.GenreResponse> genres, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "homepage")
    java.lang.String homepage, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "imdb_id")
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
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
    @com.squareup.moshi.Json(name = "production_companies")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCompany> productionCompanies, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "production_countries")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCountry> productionCountries, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String releaseDate, @com.squareup.moshi.Json(name = "revenue")
    int revenue, @com.squareup.moshi.Json(name = "runtime")
    int runtime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "spoken_languages")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.SpokenLanguage> spokenLanguages, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tagline")
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @com.squareup.moshi.Json(name = "video")
    boolean video, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_average")
    java.lang.Double voteAverage, @com.squareup.moshi.Json(name = "vote_count")
    int voteCount) {
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
    public final com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.BelongsToCollection component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CreditsResponse component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.GenreResponse> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCompany> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCountry> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int component19() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.SpokenLanguage> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    public final boolean component24() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component25() {
        return null;
    }
    
    public final int component26() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse copy(@com.squareup.moshi.Json(name = "adult")
    boolean adult, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "belongs_to_collection")
    com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.BelongsToCollection belongsToCollection, @com.squareup.moshi.Json(name = "budget")
    int budget, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "credits")
    com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.CreditsResponse credits, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "genres")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.GenreResponse> genres, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "homepage")
    java.lang.String homepage, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "imdb_id")
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
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
    @com.squareup.moshi.Json(name = "production_companies")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCompany> productionCompanies, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "production_countries")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ProductionCountry> productionCountries, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String releaseDate, @com.squareup.moshi.Json(name = "revenue")
    int revenue, @com.squareup.moshi.Json(name = "runtime")
    int runtime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "spoken_languages")
    java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.SpokenLanguage> spokenLanguages, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tagline")
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @com.squareup.moshi.Json(name = "video")
    boolean video, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "vote_average")
    java.lang.Double voteAverage, @com.squareup.moshi.Json(name = "vote_count")
    int voteCount) {
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