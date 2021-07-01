package com.elitsa.libraries.cinemaapp.ui.home;

import android.view.View;
import com.elitsa.libraries.cinemaapp.app.models.CategoryCard;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/home/HomeItemClickListener;", "", "onItemClicked", "", "view", "Landroid/view/View;", "model", "Lcom/elitsa/libraries/cinemaapp/app/models/CategoryCard;", "app_debug"})
public abstract interface HomeItemClickListener {
    
    public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.CategoryCard model);
}