package com.elitsa.libraries.cinemaapp.utils.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "", "onError", "", "errorType", "Lcom/elitsa/libraries/cinemaapp/utils/base/ErrorType;", "msg", "", "app_debug"})
public abstract interface RemoteErrorEmitter {
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.ErrorType errorType);
}