package com.elitsa.libraries.cinemaapp.utils.base;

import android.util.Log;
import kotlinx.coroutines.Dispatchers;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import retrofit2.HttpException;
import java.io.IOException;
import java.net.SocketTimeoutException;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006JA\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\u001e\b\u0004\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ,\u0010\u000f\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0010H\u0086\b\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/utils/base/BaseRemoteRepository;", "", "()V", "getErrorMessage", "", "responseBody", "Lokhttp3/ResponseBody;", "safeApiCall", "T", "emitter", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "callFunction", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeApiCallNoContext", "Lkotlin/Function0;", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract class BaseRemoteRepository {
    private static final java.lang.String TAG = "BaseRemoteRepository";
    private static final java.lang.String MESSAGE_KEY = "message";
    private static final java.lang.String ERROR_KEY = "error";
    public static final com.elitsa.libraries.cinemaapp.utils.base.BaseRemoteRepository.Companion Companion = null;
    
    /**
     * Function that executes the given function on Dispatchers.IO context and switch to Dispatchers.Main context when an error occurs
     * @param callFunction is the function that is returning the wanted object. It must be a suspend function. Eg:
     * override suspend fun loginUser(body: LoginUserBody, emitter: RemoteErrorEmitter): LoginUserResponse?  = safeApiCall( { authApi.loginUser(body)} , emitter)
     * @param emitter is the interface that handles the error messages. The error messages must be displayed on the MainThread, or else they would throw an Exception.
     */
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter emitter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> callFunction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> p2) {
        return null;
    }
    
    /**
     * Function that executes the given function in whichever thread is given. Be aware, this is not friendly with Dispatchers.IO,
     * since [RemoteErrorEmitter] is intended to display messages to the user about error from the server/DB.
     * @param callFunction is the function that is returning the wanted object. Eg:
     * override suspend fun loginUser(body: LoginUserBody, emitter: RemoteErrorEmitter): LoginUserResponse?  = safeApiCall( { authApi.loginUser(body)} , emitter)
     * @param emitter is the interface that handles the error messages. The error messages must be displayed on the MainThread, or else they would throw an Exception.
     */
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T safeApiCallNoContext(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter emitter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> callFunction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage(@org.jetbrains.annotations.Nullable()
    okhttp3.ResponseBody responseBody) {
        return null;
    }
    
    public BaseRemoteRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/utils/base/BaseRemoteRepository$Companion;", "", "()V", "ERROR_KEY", "", "MESSAGE_KEY", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}