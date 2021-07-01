package com.elitsa.libraries.cinemaapp.utils;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.elitsa.libraries.cinemaapp.app.models.CategoryCard;
import com.elitsa.libraries.cinemaapp.utils.enums.Grid;
import com.elitsa.libraries.cinemaapp.utils.enums.LayoutManagerTypes;
import com.elitsa.libraries.cinemaapp.utils.enums.Linear;
import com.elitsa.libraries.cinemaapp.utils.views.MovieProgressView;
import com.kinesis.kinesisapp.utils.base.ScreenState;
import com.skydoves.rainbow.Rainbow;
import com.skydoves.rainbow.RainbowOrientation;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u001a\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"applyRainbowGradient", "", "view", "Landroid/view/View;", "model", "Lcom/elitsa/libraries/cinemaapp/app/models/CategoryCard;", "attachEpoxyController", "epoxyRv", "Lcom/airbnb/epoxy/EpoxyRecyclerView;", "controller", "Lcom/airbnb/epoxy/EpoxyController;", "changeVisibilityWithScreenState", "movieProgressView", "Lcom/elitsa/libraries/cinemaapp/utils/views/MovieProgressView;", "screenState", "Lcom/kinesis/kinesisapp/utils/base/ScreenState;", "loadImageWithGlide", "Landroid/widget/ImageView;", "url", "", "setLayoutManager", "layoutType", "Lcom/elitsa/libraries/cinemaapp/utils/enums/LayoutManagerTypes;", "app_debug"})
public final class BindingsKt {
    
    @androidx.databinding.BindingAdapter(value = {"app:cardGradient"})
    public static final void applyRainbowGradient(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.CategoryCard model) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:loadImage"})
    public static final void loadImageWithGlide(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:attachEpoxyController"})
    public static final void attachEpoxyController(@org.jetbrains.annotations.NotNull()
    com.airbnb.epoxy.EpoxyRecyclerView epoxyRv, @org.jetbrains.annotations.NotNull()
    com.airbnb.epoxy.EpoxyController controller) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:epoxyLayoutManager"})
    public static final void setLayoutManager(@org.jetbrains.annotations.NotNull()
    com.airbnb.epoxy.EpoxyRecyclerView epoxyRv, @org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.enums.LayoutManagerTypes layoutType) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:screenStateVisibility"})
    public static final void changeVisibilityWithScreenState(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.views.MovieProgressView movieProgressView, @org.jetbrains.annotations.NotNull()
    com.kinesis.kinesisapp.utils.base.ScreenState screenState) {
    }
}