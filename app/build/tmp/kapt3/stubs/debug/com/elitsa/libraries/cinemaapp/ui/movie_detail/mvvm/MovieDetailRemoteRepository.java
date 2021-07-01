package com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm;

import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi;
import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse;
import com.elitsa.libraries.cinemaapp.utils.base.BaseRemoteRepository;
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J#\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRemoteRepository;", "Lcom/elitsa/libraries/cinemaapp/utils/base/BaseRemoteRepository;", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$RemoteRepository;", "api", "Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieDetailApi;", "(Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieDetailApi;)V", "getMovieAndCast", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/MovieDetailResponse;", "remoteErrorEmitter", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "movieId", "", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieDetailRemoteRepository extends com.elitsa.libraries.cinemaapp.utils.base.BaseRemoteRepository implements com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.RemoteRepository {
    private final com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi api = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieAndCast(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter remoteErrorEmitter, int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse> p2) {
        return null;
    }
    
    public MovieDetailRemoteRepository(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi api) {
        super();
    }
}