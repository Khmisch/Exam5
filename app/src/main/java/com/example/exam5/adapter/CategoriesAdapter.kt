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
import com.google.android.material.imageview.ShapeableImageView

class CategoriesAdapter (var context: HomeFragment, var items:ArrayList<Categories>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_categories_view, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feed = items[position]

        if (holder is StoryViewHolder){
            var iv_food =holder.iv_food
            var tv_name =holder.tv_name

            iv_food.setImageResource(feed.images)
            tv_name.text = feed.name
        }
    }

    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var iv_food: ImageView = view.findViewById(R.id.iv_food)
        var tv_name : TextView = view.findViewById(R.id.tv_name)

    }
}