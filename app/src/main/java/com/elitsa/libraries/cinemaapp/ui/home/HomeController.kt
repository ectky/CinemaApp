package com.elitsa.libraries.cinemaapp.ui.home

import com.airbnb.epoxy.Typed2EpoxyController
import com.airbnb.epoxy.TypedEpoxyController
import com.elitsa.libraries.cinemaapp.app.models.CategoryCard
import com.elitsa.libraries.cinemaapp.gradientCard

class HomeController : Typed2EpoxyController<List<CategoryCard>, HomeItemClickListener>() {

    override fun buildModels(data1: List<CategoryCard>?, data2: HomeItemClickListener?) {
        data1?.let { itemList->
            itemList.forEach {
                gradientCard {
                    id(it.hashCode())
                    model(it)
                    clickListener { _, _, clickedView, _ -> data2?.onItemClicked(clickedView, it) }
                }
            }
        }
    }
}