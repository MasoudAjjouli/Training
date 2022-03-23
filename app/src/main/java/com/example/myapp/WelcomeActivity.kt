package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myapp.databinding.ActivityWelcomeBinding
import com.example.myapp.fragments.BlueFragment
import com.example.myapp.fragments.RedFragment
import com.example.myapp.fragments.YellowFragment

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    private lateinit var colorsAdapterColors: ColorsViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)
        initView()
    }

    private fun initView() {
        colorsAdapterColors = ColorsViewPagerAdapter(this@WelcomeActivity)
        with(binding) {
            viewPager.adapter = colorsAdapterColors
            tlColorFragment.setupWithViewPager(viewPager, true)
        }

    }
}