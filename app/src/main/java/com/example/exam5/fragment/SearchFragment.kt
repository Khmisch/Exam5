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
import com.example.exam5.adapter.SearchAdapter
import com.example.exam5.model.Categories
import com.example.exam5.model.Restaurants
import com.example.exam5.model.Search
import java.util.ArrayList

class SearchFragment : Fragment() {
    lateinit var recyclerCategories: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_search, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerCategories = view.findViewById(R.id.recyclerView)
        recyclerCategories.setLayoutManager(GridLayoutManager(context, 1))
        refreshAdapterCat(getAllCategories())
    }

    private fun refreshAdapterCat(chats: ArrayList<Search>) {
        val adapter = SearchAdapter(this, chats)
        recyclerCategories!!.adapter = adapter

    }
    private fun getAllCategories(): ArrayList<Search> {
        val chats: ArrayList<Search> = ArrayList<Search>()
        chats.add(Search(R.drawable.im_sample_food_0, "Restaurants","104 Fulton St"))
        chats.add(Search(R.drawable.im_sample_food_2, "Coffee Shop","1134 Union St" ))
        chats.add(Search(R.drawable.im_sample_food_3, "Shopping", "264 Filmore St"))
        chats.add(Search(R.drawable.im_sample_food_1, "Sport","1064 Market St" ))
        chats.add(Search(R.drawable.im_sample_food_0, "Restaurants","104 Fulton St"))
        chats.add(Search(R.drawable.im_sample_food_2, "Coffee Shop","1134 Union St" ))
        chats.add(Search(R.drawable.im_sample_food_3, "Shopping", "264 Filmore St"))
        chats.add(Search(R.drawable.im_sample_food_1, "Sport","1064 Market St" ))
        chats.add(Search(R.drawable.im_sample_food_0, "Restaurants","104 Fulton St"))
        chats.add(Search(R.drawable.im_sample_food_2, "Coffee Shop","1134 Union St" ))
        chats.add(Search(R.drawable.im_sample_food_3, "Shopping", "264 Filmore St"))
        chats.add(Search(R.drawable.im_sample_food_1, "Sport","1064 Market St" ))

        return chats
    }


}