package com.example.exam5.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.exam5.fragment.IntroFragment

class IntroFragmentAdapter(fm: FragmentManager, behavior: Int) :
    FragmentPagerAdapter(fm, behavior) {
    override fun getItem(position: Int): Fragment {
        return IntroFragment.newInstance(position)
    }

    // size is hardcoded
    override fun getCount(): Int {
        return 4
    }
}