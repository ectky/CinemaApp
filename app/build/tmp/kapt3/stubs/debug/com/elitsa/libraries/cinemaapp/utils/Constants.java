package com.elitsa.libraries.cinemaapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/utils/Constants;", "", "()V", "APPEND_TO_RESPONSE", "", "BASE_IMG_URL", "CATEGORY_CARD_ID", "DB_NAME", "DB_VERSION", "", "FEATURED_MOVIE_IMG_URL", "MOVIE_EXTRA", "MOVIE_ID", "TRANSITION_CATEGORY_IMAGE_IV", "TRANSITION_CATEGORY_NAME_TV", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEATURED_MOVIE_IMG_URL = "https://pmcdeadline2.files.wordpress.com/2019/03/star-wars-the-rise-of-skywalker-logo.jpg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_CARD_ID = "CategoryCard";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_ID = "movie_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_EXTRA = "movie";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRANSITION_CATEGORY_NAME_TV = "categoryTitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRANSITION_CATEGORY_IMAGE_IV = "categoryIv";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_IMG_URL = "https://image.tmdb.org/t/p/w500";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPEND_TO_RESPONSE = "append_to_response";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "movie_app_db";
    public static final int DB_VERSION = 1;
    public static final com.elitsa.libraries.cinemaapp.utils.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}