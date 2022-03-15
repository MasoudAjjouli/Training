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
import com.example.myapp.R.layout.*
import com.example.myapp.databinding.ActivityMainBindingImpl
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initView()
    }

    private fun initView() {
        binding.myVar = ("Welcome Back!")
        with(binding){
            login.setOnClickListener {
                emailAddress.addTextChangedListener(object : TextWatcher {
                    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    }

                    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    }

                    override fun afterTextChanged(p0: Editable?) {
                        if (android.util.Patterns.EMAIL_ADDRESS.matcher(emailAddress.text.toString())
                                .matches()
                        )
                            login.isEnabled = true
                        else {
                            login.isEnabled = false
                            emailAddress.setError("Invalid Email Address!")
                        }
                    }
                })

                if (emailAddress.text.isNullOrBlank() && binding.password.text.isNullOrBlank())
                    Toast.makeText(this, "Please Enter your Email and Passowrd", Toast.LENGTH_SHORT)
                        .show()

                if (emailAddress.text.isNotBlank() && binding.password.text.isNullOrBlank()) {

                    Toast.makeText(this, "Please Enter your Password", Toast.LENGTH_SHORT).show()
                }

                if (emailAddress.text.isNullOrBlank() && binding.password.text.isNotBlank()) {

                    Toast.makeText(this, "Please Enter your Email", Toast.LENGTH_SHORT).show()
                }

                if ((binding.emailAddress.text.contains("admin@gmail.com")) && (binding.password.text.contains("admin"))
                ) {

                    Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, WelcomePage::class.java)
                    startActivity(intent)
                }
                if (binding.emailAddress.text.isNotBlank() && binding.password.text.isNotBlank() && !binding.emailAddress.text.contains("admin@gmail.com") && !binding.password.text.contains("admin")     //
                ) {
                    Toast.makeText(this, "Email or Password are not coreect", Toast.LENGTH_SHORT).show()
                }

            }
        }
        binding.login.setOnClickListener {
            binding.emailAddress.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun afterTextChanged(p0: Editable?) {
                    if (android.util.Patterns.EMAIL_ADDRESS.matcher(binding.emailAddress.text.toString())
                            .matches()
                    )
                        binding.login.isEnabled = true
                    else {
                        binding.login.isEnabled = false
                        binding.emailAddress.setError("Invalid Email Address!")
                    }
                }
            })

            if (binding.emailAddress.text.isNullOrBlank() && binding.password.text.isNullOrBlank())
                Toast.makeText(this, "Please Enter your Email and Passowrd", Toast.LENGTH_SHORT)
                    .show()

            if (binding.emailAddress.text.isNotBlank() && binding.password.text.isNullOrBlank()) {

                Toast.makeText(this, "Please Enter your Password", Toast.LENGTH_SHORT).show()
            }

            if (binding.emailAddress.text.isNullOrBlank() && binding.password.text.isNotBlank()) {

                Toast.makeText(this, "Please Enter your Email", Toast.LENGTH_SHORT).show()
            }

            if ((binding.emailAddress.text.contains("admin@gmail.com")) && (binding.password.text.contains("admin"))
            ) {

                Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, WelcomePage::class.java)
                startActivity(intent)
            }
            if (binding.emailAddress.text.isNotBlank() && binding.password.text.isNotBlank() && !binding.emailAddress.text.contains("admin@gmail.com") && !binding.password.text.contains("admin")     //
            ) {
                Toast.makeText(this, "Email or Password are not coreect", Toast.LENGTH_SHORT).show()
            }

        }
    }
}

