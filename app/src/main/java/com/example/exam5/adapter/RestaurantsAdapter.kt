package com.example.exam5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam5.R
import com.example.exam5.fragment.HomeFragment
import com.example.exam5.model.Categories
import com.example.exam5.model.Restaurants

class RestaurantsAdapter (var context: HomeFragment, var items:ArrayList<Restaurants>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_restaurants_view, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feed = items[position]

        if (holder is StoryViewHolder){
            var iv_food =holder.iv_food
            var iv_stars =holder.iv_stars
            var tv_location =holder.tv_location
            var tv_name =holder.tv_name

            iv_food.setImageResource(feed.image)
            iv_stars.setImageResource(feed.stars)
            tv_name.text = feed.name
            tv_location.text = feed.location
        }
    }

    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var iv_food: ImageView = view.findViewById(R.id.iv_food)
        var iv_stars: ImageView = view.findViewById(R.id.iv_stars)
        var tv_name : TextView = view.findViewById(R.id.tv_name)
        var tv_location : TextView = view.findViewById(R.id.tv_location)

    }
}