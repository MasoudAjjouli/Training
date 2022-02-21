package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapp.R.layout
import com.example.myapp.R.layout.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(activity_main)

       val button = findViewById<Button>(R.id.button)
        val EditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val EditPassword = findViewById<EditText>(R.id.editTextTextPassword)
        val str: String = EditText.text.toString()
        val str2: String = EditPassword.text.toString()
        button.setOnClickListener{

            if (EditText.text.isNullOrBlank() && EditPassword.text.isNullOrBlank()){
                Toast.makeText(this,"Please Enter your Email and Passowrd",Toast.LENGTH_SHORT).show()
            }

            if (EditText.text.isNotBlank() && EditPassword.text.isNullOrBlank()){
                Toast.makeText(this,"Please Enter your Passowrd",Toast.LENGTH_SHORT).show()
            }

            if (EditPassword.text.isNotBlank() && EditText.text.isNullOrBlank()){
                Toast.makeText(this,"Please Enter your Email",Toast.LENGTH_SHORT).show()
            }
            if (EditText.text.isNotBlank() && EditPassword.text.isNotBlank()){
                Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()
            }



        }


        println("the value is $str ")
        println("the value is $str2")

    }

}