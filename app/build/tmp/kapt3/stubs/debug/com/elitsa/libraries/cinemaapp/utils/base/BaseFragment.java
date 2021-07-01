package com.elitsa.libraries.cinemaapp.utils.base;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent;
import com.elitsa.libraries.cinemaapp.utils.Utils;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH$J\b\u0010 \u001a\u00020\u001dH\u0016J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u001bJ\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\u001bJ\u0018\u0010\'\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u001bJ\u0018\u0010\'\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\r8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/elitsa/libraries/cinemaapp/utils/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "layout", "", "(I)V", "fragmentView", "Landroid/view/View;", "getFragmentView", "()Landroid/view/View;", "setFragmentView", "(Landroid/view/View;)V", "noInternetError", "", "getNoInternetError", "()Ljava/lang/String;", "noInternetError$delegate", "Lkotlin/Lazy;", "timeoutErrorMessage", "getTimeoutErrorMessage", "timeoutErrorMessage$delegate", "unknownErrorMessage", "getUnknownErrorMessage", "unknownErrorMessage$delegate", "getDefaultNavOptions", "Landroidx/navigation/NavOptions;", "fade", "", "initComponent", "", "appComponent", "Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "onDestroyView", "showErrorMessage", "errorType", "Lcom/elitsa/libraries/cinemaapp/utils/base/ErrorType;", "showSnackError", "msg", "long", "showSnackSuccess", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy unknownErrorMessage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy timeoutErrorMessage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy noInternetError$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.View fragmentView;
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
    
    @org.jetbrains.annotations.Nullable()
    protected final android.view.View getFragmentView() {
        return null;
    }
    
    protected final void setFragmentView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    protected abstract void initComponent(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent appComponent);
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void showSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, boolean p1_1663806) {
    }
    
    public final void showSnackError(int msg, boolean p1_1663806) {
    }
    
    public final void showSnackSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, boolean p1_1663806) {
    }
    
    public final void showSnackSuccess(int msg, boolean p1_1663806) {
    }
    
    public final void showErrorMessage(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.ErrorType errorType) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.navigation.NavOptions getDefaultNavOptions(boolean fade) {
        return null;
    }
    
    public BaseFragment() {
        super();
    }
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super();
    }
}