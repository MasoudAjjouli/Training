package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.databinding.ActivityCellDetailBinding
import com.example.myapp.models.USER_ID
import com.example.myapp.models.UserInfo
import com.example.myapp.models.UserInfoElement



class CellDetail : AppCompatActivity() {

    private lateinit var binding: ActivityCellDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCellDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_cell_detail)

        val UserID =intent.getIntExtra(USER_ID, -1)
        val user = userFromID(UserID)
        if(user != null){
            binding.fullName.text= user.fullName
            binding.emailAddress.text = user.emailAddress
        }
    }

    private fun userFromID(userID: Int): UserInfoElement?{

        for (user in UserInfoElement){
            if(user.id?.equals(USER_ID) == true)
                return user
        }
        return null
    }
}