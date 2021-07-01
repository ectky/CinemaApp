package com.elitsa.libraries.cinemaapp.utils.base;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kinesis.kinesisapp.utils.base.ScreenState;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/utils/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "()V", "mutableErrorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getMutableErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "mutableErrorType", "Lcom/elitsa/libraries/cinemaapp/utils/base/ErrorType;", "getMutableErrorType", "mutableProgress", "", "getMutableProgress", "mutableScreenState", "Lcom/kinesis/kinesisapp/utils/base/ScreenState;", "getMutableScreenState", "mutableSuccessMessage", "getMutableSuccessMessage", "onError", "", "errorType", "msg", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mutableProgress = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.kinesis.kinesisapp.utils.base.ScreenState> mutableScreenState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mutableErrorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mutableSuccessMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.elitsa.libraries.cinemaapp.utils.base.ErrorType> mutableErrorType = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMutableProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kinesis.kinesisapp.utils.base.ScreenState> getMutableScreenState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMutableErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMutableSuccessMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.elitsa.libraries.cinemaapp.utils.base.ErrorType> getMutableErrorType() {
        return null;
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.ErrorType errorType) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public BaseViewModel() {
        super();
    }
}