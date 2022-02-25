package com.example.exam5.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam5.R
import com.example.exam5.adapter.CategoriesAdapter
import com.example.exam5.adapter.RestaurantsAdapter
import com.example.exam5.model.Categories
import com.example.exam5.model.Restaurants
import java.util.ArrayList

class HomeFragment: Fragment() {
    lateinit var recyclerCategories: RecyclerView
    lateinit var recyclerRestaurants: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerCategories = view.findViewById(R.id.recyclerCategories)
        recyclerCategories.setLayoutManager(LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false ))
        refreshAdapterCat(getAllCategories())
        recyclerRestaurants = view.findViewById(R.id.recyclerRestaurants)
        recyclerRestaurants.setLayoutManager(GridLayoutManager(context, 2))
        refreshAdapterRes(getAllRestaurants())
    }

    private fun refreshAdapterCat(chats: ArrayList<Categories>) {
        val adapter = CategoriesAdapter(this, chats)
        recyclerCategories!!.adapter = adapter

    }
    private fun refreshAdapterRes(chats: ArrayList<Restaurants>) {
        val adapter = RestaurantsAdapter(this, chats)
        recyclerRestaurants!!.adapter = adapter

    }
    private fun getAllCategories(): ArrayList<Categories> {
        val chats: ArrayList<Categories> = ArrayList<Categories>()
                chats.add(Categories(R.drawable.im_sample_food_0, "Restaurants"))
                chats.add(Categories(R.drawable.im_sample_food_1, "Coffee Shop"))
                chats.add(Categories(R.drawable.im_sample_food_2, "Shopping"))
                chats.add(Categories(R.drawable.im_sample_food_3, "Sport"))

        return chats
    }
    private fun getAllRestaurants(): ArrayList<Restaurants> {
        val chats: ArrayList<Restaurants> = ArrayList<Restaurants>()
        chats.add(Restaurants(R.drawable.im_sample_food_0, "Gamine", R.drawable.im_sample_stars_0,"104 Fulton St"))
        chats.add(Restaurants(R.drawable.im_sample_food_1, "Doppio Zero", R.drawable.im_sample_stars_0,"1134 Union St"))
        chats.add(Restaurants(R.drawable.im_sample_food_2, "Coffee Shop",R.drawable.im_sample_stars_0,"264 Filmore St"))
        chats.add(Restaurants(R.drawable.im_sample_food_3, "Lupa Tratotta",R.drawable.im_sample_stars_0,"1064 Market St"))
        chats.add(Restaurants(R.drawable.im_sample_food_0, "Gamine", R.drawable.im_sample_stars_0,"104 Fulton St"))
        chats.add(Restaurants(R.drawable.im_sample_food_1, "Doppio Zero", R.drawable.im_sample_stars_0,"1134 Union St"))
        chats.add(Restaurants(R.drawable.im_sample_food_2, "Coffee Shop",R.drawable.im_sample_stars_0,"264 Filmore St"))
        chats.add(Restaurants(R.drawable.im_sample_food_3, "Lupa Tratotta",R.drawable.im_sample_stars_0,"1064 Market St"))

        return chats
    }




}