package com.elitsa.libraries.cinemaapp.utils.base;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent;
import com.elitsa.libraries.cinemaapp.utils.Utils;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH$J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020&J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\r2\b\b\u0002\u0010%\u001a\u00020&J\u001c\u0010\'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0)J\u001c\u0010\'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0)J\u0018\u0010*\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020&J\u0018\u0010*\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\r2\b\b\u0002\u0010%\u001a\u00020&R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\r8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\r8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006+"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/utils/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "layout", "", "(I)V", "mainView", "Landroid/view/View;", "getMainView", "()Landroid/view/View;", "mainView$delegate", "Lkotlin/Lazy;", "noInternetError", "", "getNoInternetError", "()Ljava/lang/String;", "noInternetError$delegate", "timeoutErrorMessage", "getTimeoutErrorMessage", "timeoutErrorMessage$delegate", "unknownErrorMessage", "getUnknownErrorMessage", "unknownErrorMessage$delegate", "getDefaultNavOptions", "Landroidx/navigation/NavOptions;", "initComponent", "", "appComponent", "Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showErrorMessage", "errorType", "Lcom/elitsa/libraries/cinemaapp/utils/base/ErrorType;", "showSnackError", "msg", "long", "", "showSnackErrorWithAction", "action", "Lkotlin/Function0;", "showSnackSuccess", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy unknownErrorMessage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy timeoutErrorMessage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy noInternetError$delegate = null;
    private final kotlin.Lazy mainView$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getUnknownErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getTimeoutErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getNoInternetError() {
        return null;
    }
    
    private final android.view.View getMainView() {
        return null;
    }
    
    protected abstract void initComponent(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent appComponent);
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, boolean p1_1663806) {
    }
    
    public final void showSnackError(int msg, boolean p1_1663806) {
    }
    
    public final void showSnackErrorWithAction(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public final void showSnackErrorWithAction(int msg, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public final void showSnackSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, boolean p1_1663806) {
    }
    
    public final void showSnackSuccess(int msg, boolean p1_1663806) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavOptions getDefaultNavOptions() {
        return null;
    }
    
    public final void showErrorMessage(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.ErrorType errorType) {
    }
    
    public BaseActivity() {
        super();
    }
    
    public BaseActivity(@androidx.annotation.LayoutRes()
    int layout) {
        super();
    }
}