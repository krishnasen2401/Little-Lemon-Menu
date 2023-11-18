package com.littlelemon.menu

import com.littlelemon.menu.model.FilterHelper
import com.littlelemon.menu.model.FilterType
import org.junit.Test

class FilterHelperTest {

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", R.drawable.bouillabaisse)
        )

        FilterHelper().filterProducts(FilterType.Dessert, sampleProductsList)
    }
}