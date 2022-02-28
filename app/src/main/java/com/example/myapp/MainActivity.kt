package com.example.myapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myapp.R.layout.*
import com.example.myapp.databinding.ActivityMainBindingImpl
import com.example.myapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(activity_main)

        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myVar = ("Hi")
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val editPassword = findViewById<EditText>(R.id.editTextTextPassword)
        val str: String = editText.text.toString()
        val str2: String = editPassword.text.toString()
        button.setOnClickListener {

            if (editText.text.isNullOrBlank() && editPassword.text.isNullOrBlank()) {
                Toast.makeText(this, "Please Enter your Email and Passowrd", Toast.LENGTH_SHORT)
                    .show()
            }

            if (editText.text.isNotBlank() && editPassword.text.isNullOrBlank()) {
                Toast.makeText(this, "Please Enter your Passowrd", Toast.LENGTH_SHORT).show()
            }

            if (editPassword.text.isNotBlank() && editText.text.isNullOrBlank()) {
                Toast.makeText(this, "Please Enter your Email", Toast.LENGTH_SHORT).show()
            }
            if (editText.text.isNotBlank() && editPassword.text.isNotBlank()) {
                Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
            }


        }


        println("the value is $str ")
        println("the value is $str2")

    }

}