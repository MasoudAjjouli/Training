package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapp.databinding.ActivityWelcomeBinding
import com.example.myapp.fragments.BlueFragment
import com.example.myapp.fragments.RedFragment
import com.example.myapp.fragments.YellowFragment

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        initView()
    }

    private fun initView() {
        var binding: ActivityWelcomeBinding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf(

            RedFragment(),
            YellowFragment(),
            BlueFragment()
        )

        val adapter = ViewPagerAdapter(fragments ,this)
        binding.viewPager.adapter = adapter
    }

}