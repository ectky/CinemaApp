package com.elitsa.libraries.cinemaapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityOptionsCompat;
import androidx.databinding.DataBindingUtil;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent;
import com.elitsa.libraries.cinemaapp.app.models.CategoryCard;
import com.elitsa.libraries.cinemaapp.databinding.ActivityMainBinding;
import com.elitsa.libraries.cinemaapp.ui.movie_list.MovieListActivity;
import com.elitsa.libraries.cinemaapp.utils.Constants;
import com.elitsa.libraries.cinemaapp.utils.ModelsFactory;
import com.elitsa.libraries.cinemaapp.utils.base.BaseActivity;
import com.elitsa.libraries.cinemaapp.utils.enums.Grid;
import androidx.core.util.Pair;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/home/MainActivity;", "Lcom/elitsa/libraries/cinemaapp/utils/base/BaseActivity;", "Lcom/elitsa/libraries/cinemaapp/ui/home/HomeItemClickListener;", "()V", "binding", "Lcom/elitsa/libraries/cinemaapp/databinding/ActivityMainBinding;", "getBinding", "()Lcom/elitsa/libraries/cinemaapp/databinding/ActivityMainBinding;", "setBinding", "(Lcom/elitsa/libraries/cinemaapp/databinding/ActivityMainBinding;)V", "myListCard", "Lcom/elitsa/libraries/cinemaapp/app/models/CategoryCard;", "initComponent", "", "appComponent", "Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "view", "Landroid/view/View;", "model", "app_debug"})
public final class MainActivity extends com.elitsa.libraries.cinemaapp.utils.base.BaseActivity implements com.elitsa.libraries.cinemaapp.ui.home.HomeItemClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.elitsa.libraries.cinemaapp.databinding.ActivityMainBinding binding;
    private final com.elitsa.libraries.cinemaapp.app.models.CategoryCard myListCard = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.databinding.ActivityMainBinding p0) {
    }
    
    @java.lang.Override()
    protected void initComponent(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent appComponent) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.CategoryCard model) {
    }
    
    public MainActivity() {
        super();
    }
}