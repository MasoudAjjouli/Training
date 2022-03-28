package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myapp.databinding.ActivityWelcomeBinding
import com.example.myapp.databinding.ActivityWelcomeNewBinding
import com.example.myapp.fragments.BlueFragment
import com.example.myapp.fragments.RedFragment
import com.example.myapp.fragments.YellowFragment

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome_new)
        initView()
    }

    private fun initView() {

    }
}