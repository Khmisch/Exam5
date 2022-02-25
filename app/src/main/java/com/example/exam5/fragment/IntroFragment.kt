package com.example.exam5.fragment

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.example.exam5.R

class IntroFragment : Fragment() {
    private var position = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            position = requireArguments().getInt(ARG_POSITION)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro_pages, container, false)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val iv_icons = view.findViewById<ImageView>(R.id.iv_icons)
        val title = view.findViewById<TextView>(R.id.tv_title)
        val text = view.findViewById<TextView>(R.id.tv_text)
        // set page title
        title.setText(PAGE_TITLES[position])
        // set page sub title text
        text.setText(PAGE_TEXT[position])
        iv_icons.setImageResource(PAGE_SUB_TEXT[position])
    }

    companion object {
        private const val ARG_POSITION = "slider-position"

        // prepare all title ids arrays
        @StringRes
        private val PAGE_TITLES = intArrayOf(R.string.saved_list_title, R.string.add_list_title, R.string.chat_title, R.string.notify_title, )

        // prepare all subtitle ids arrays
        @StringRes
        private val PAGE_TEXT = intArrayOf(
            R.string.saved_list_text, R.string.add_list_text, R.string.chat_text,R.string.notify_text
        )

        @StringRes
        private val PAGE_SUB_TEXT = intArrayOf(
            R.drawable.ic_heart, R.drawable.ic_add_listing, R.drawable.ic_chat, R.drawable.ic_notification,
        )

        fun newInstance(position: Int): IntroFragment {
            val fragment = IntroFragment()
            val args = Bundle()
            args.putInt(ARG_POSITION, position)
            fragment.arguments = args
            return fragment
        }
    }
}
