package com.example.exam5.activity

import android.R.attr.left
import android.R.attr.right
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener
import com.example.exam5.R
import com.example.exam5.adapter.IntroFragmentAdapter
import com.example.sharedpreference.manager.SharedPref
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator


class IntroActivity : AppCompatActivity() ,  View.OnClickListener{

    private lateinit var viewPager: ViewPager
    private var adapter: IntroFragmentAdapter? = null
    var dotsIndicator: WormDotsIndicator? = null
    lateinit var tv_skip:TextView
    lateinit var tv_next:TextView
    lateinit var tv_done:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        initViews()
    }

    private fun initViews() {
        dotsIndicator = findViewById<View>(R.id.dots_indicator) as WormDotsIndicator
        viewPager = findViewById(R.id.viewpager)
        tv_skip = findViewById<TextView>(R.id.tv_skip)
        tv_skip.setOnClickListener(this)
        tv_next = findViewById<TextView>(R.id.tv_next)
        tv_next.setOnClickListener(this)
        tv_done = findViewById<TextView>(R.id.tv_done)
        tv_done.setOnClickListener(this)
        // init slider pager adapter
        adapter = IntroFragmentAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        // set adapter
        viewPager.setAdapter(adapter)
        // set dot indicators
        dotsIndicator!!.setViewPager(viewPager)
        // make status bar transparent

        viewPager.addOnPageChangeListener(object : SimpleOnPageChangeListener() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                if (position == adapter!!.count - 1) {
                    tv_next.setVisibility(View.INVISIBLE)
                    tv_done.setVisibility(View.VISIBLE)
                }
            }
        })
    }



    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.tv_skip -> callMainActivity()
//            R.id.tv_next -> viewPager
            R.id.tv_done -> callMainActivity()
        }
    }

    private fun callMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}