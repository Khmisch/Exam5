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
import com.example.exam5.adapter.CollectionsAdapter
import com.example.exam5.adapter.RestaurantsAdapter
import com.example.exam5.model.Categories
import com.example.exam5.model.Collections
import com.example.exam5.model.Restaurants
import java.util.ArrayList

class CollectionsFragment: Fragment() {
    lateinit var recyclerCategories: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_collectors, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerCategories = view.findViewById(R.id.recyclerView)
        recyclerCategories.setLayoutManager(GridLayoutManager(context, 1))
        refreshAdapterCat(getAllCategories())
    }

    private fun refreshAdapterCat(chats: ArrayList<Collections>) {
        val adapter = CollectionsAdapter(this, chats)
        recyclerCategories!!.adapter = adapter

    }
    private fun getAllCategories(): ArrayList<Collections> {
        val chats: ArrayList<Collections> = ArrayList<Collections>()
        chats.add(Collections(R.drawable.im_sample_food_0, "Restaurants"))
        chats.add(Collections(R.drawable.im_sample_food_1, "Coffee Shop"))
        chats.add(Collections(R.drawable.im_sample_food_2, "Shopping"))
        chats.add(Collections(R.drawable.im_sample_food_3, "Sport"))
        chats.add(Collections(R.drawable.im_sample_food_0, "Restaurants"))
        chats.add(Collections(R.drawable.im_sample_food_1, "Coffee Shop"))
        chats.add(Collections(R.drawable.im_sample_food_2, "Shopping"))
        chats.add(Collections(R.drawable.im_sample_food_3, "Sport"))
        chats.add(Collections(R.drawable.im_sample_food_0, "Restaurants"))
        chats.add(Collections(R.drawable.im_sample_food_1, "Coffee Shop"))
        chats.add(Collections(R.drawable.im_sample_food_2, "Shopping"))
        chats.add(Collections(R.drawable.im_sample_food_3, "Sport"))

        return chats
    }

}