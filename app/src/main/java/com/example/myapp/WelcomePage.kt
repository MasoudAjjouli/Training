package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myapp.R.layout.*
import com.example.myapp.databinding.ActivityMainBindingImpl
import com.example.myapp.databinding.ActivityMainBinding
import com.example.myapp.databinding.ActivityWelcomePageBinding

class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_welcome_page)

//       var binding2: ActivityWelcomePageBinding =
//           DataBindingUtil.setContentView(this, R.layout.activity_welcome_page)

        var binding: ActivityWelcomePageBinding = ActivityWelcomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frag1.setOnClickListener {
            replaceFragment(fragment1())
        }

        binding.frag2.setOnClickListener {
            replaceFragment(fragment2())
        }

        binding.frag3.setOnClickListener {
            replaceFragment(fragment3())
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManger = supportFragmentManager
        val fragmentTransaction = fragmentManger.beginTransaction()
        fragmentTransaction.replace(R.id.fragment, fragment)
        fragmentTransaction.commit()
    }
}