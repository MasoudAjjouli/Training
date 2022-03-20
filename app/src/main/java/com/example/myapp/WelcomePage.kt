package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapp.databinding.ActivityWelcomePageBinding

class WelcomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intView()
    }

    private fun intView() {
        var binding: ActivityWelcomePageBinding = ActivityWelcomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}