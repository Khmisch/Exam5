package com.example.exam5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam5.R
import com.example.exam5.fragment.CollectionsFragment
import com.example.exam5.fragment.SearchFragment
import com.example.exam5.model.Messages
import com.example.exam5.model.Search
import com.google.android.material.imageview.ShapeableImageView

class SearchAdapter  (var context: SearchFragment, var items:ArrayList<Search>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_messages_view, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feed = items[position]

        if (holder is StoryViewHolder){
            var iv_food =holder.iv_food
            var tv_name =holder.tv_name
            var tv_location =holder.tv_location

            iv_food.setImageResource(feed.image)
            tv_name.text = feed.name
            tv_location.text = feed.location
        }
    }

    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var iv_food: ShapeableImageView = view.findViewById(R.id.iv_profile)
        var tv_name : TextView = view.findViewById(R.id.tv_fullname)
        var tv_location : TextView = view.findViewById(R.id.tv_location)

    }
}