package com.elitsa.libraries.cinemaapp.utils;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.CarouselModelBuilder;
import com.airbnb.epoxy.EpoxyModel;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;
import java.util.regex.Pattern;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\t\u001a\u0012\u0010\n\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\t2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\t*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u001c\u0010\u0012\u001a\u00020\u0013*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u001a\u0012\u0010\u0015\u001a\u00020\t*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0005\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u000e\u001a\u0014\u0010\u0018\u001a\u00020\u0013*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\t2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u001c\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005\u001a\u0012\u0010\u001c\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u001c\u001a\u00020\u0013*\u00020\u001d2\u0006\u0010\r\u001a\u00020\u0005\u001a\u0012\u0010\u001c\u001a\u00020\u0013*\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u001e\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0005\u001a\u0012\u0010 \u001a\u00020\f*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005\u001a\u0012\u0010 \u001a\u00020\f*\u00020\t2\u0006\u0010\r\u001a\u00020\u000e\u001a\n\u0010!\u001a\u00020\u000e*\u00020\"\u001a\n\u0010#\u001a\u00020\u0017*\u00020\u000e\u001a9\u0010$\u001a\u00020\u0013\"\u0004\b\u0000\u0010%*\u00020&2\f\u0010\'\u001a\b\u0012\u0004\u0012\u0002H%0(2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u0002H%\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*H\u0086\b\u00a8\u0006,"}, d2 = {"getMenuItem", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "id", "", "getParentActivity", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/Context;", "Landroid/view/View;", "getSelectedItem", "indefiniteSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "msg", "", "inflate", "Landroid/view/ViewGroup;", "layout", "inflateCustomView", "", "viewGroup", "inflateView", "isAnEmailAddress", "", "loadImageWithGlide", "Landroid/widget/ImageView;", "imgUrl", "longSnackbar", "longToast", "Landroidx/fragment/app/Fragment;", "setLayoutChangeAnim", "layoutChange", "snackbar", "textString", "Landroid/widget/EditText;", "validPhoneNumber", "withModelsFrom", "T", "Lcom/airbnb/epoxy/CarouselModelBuilder;", "items", "", "modelBuilder", "Lkotlin/Function1;", "Lcom/airbnb/epoxy/EpoxyModel;", "app_debug"})
public final class FunExtensionsKt {
    
    public static final boolean isAnEmailAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isAnEmailAddress) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String textString(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$textString) {
        return null;
    }
    
    public static final boolean validPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$validPhoneNumber) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View inflate(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$inflate, int layout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View inflateView(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$inflateView, int layout) {
        return null;
    }
    
    public static final void inflateCustomView(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$inflateCustomView, int layout, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup viewGroup) {
    }
    
    public static final void setLayoutChangeAnim(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$setLayoutChangeAnim, int layoutChange) {
    }
    
    public static final android.view.MenuItem getSelectedItem(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView $this$getSelectedItem) {
        return null;
    }
    
    public static final android.view.MenuItem getMenuItem(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView $this$getMenuItem, int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final androidx.appcompat.app.AppCompatActivity getParentActivity(@org.jetbrains.annotations.NotNull()
    android.view.View $this$getParentActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final androidx.appcompat.app.AppCompatActivity getParentActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getParentActivity) {
        return null;
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$longToast, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$longToast, int msg) {
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$longToast, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, int msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar snackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar longSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$longSnackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar longSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$longSnackbar, int msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar indefiniteSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$indefiniteSnackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar indefiniteSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$indefiniteSnackbar, int msg) {
        return null;
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$longToast, int msg) {
    }
    
    public static final void loadImageWithGlide(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageWithGlide, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    public static final <T extends java.lang.Object>void withModelsFrom(@org.jetbrains.annotations.NotNull()
    com.airbnb.epoxy.CarouselModelBuilder $this$withModelsFrom, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends com.airbnb.epoxy.EpoxyModel<?>> modelBuilder) {
    }
}