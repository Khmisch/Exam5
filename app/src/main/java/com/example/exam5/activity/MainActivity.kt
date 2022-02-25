package com.example.exam5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.exam5.R
import com.example.exam5.fragment.CollectionsFragment
import com.example.exam5.fragment.HomeFragment
import com.example.exam5.fragment.MessagesFragment
import com.example.exam5.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment=HomeFragment()
        val collectionFragment=CollectionsFragment()
        val messagesFragment=MessagesFragment()
        val searchFragment=SearchFragment()
        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        setCurrentFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home->setCurrentFragment(homeFragment)
                R.id.menu_collections->setCurrentFragment(collectionFragment)
                R.id.menu_messages->setCurrentFragment(messagesFragment)
                R.id.menu_search->setCurrentFragment(searchFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}