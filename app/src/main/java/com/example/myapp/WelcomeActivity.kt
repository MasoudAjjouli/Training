package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapp.databinding.ActivityWelcomeNewBinding


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