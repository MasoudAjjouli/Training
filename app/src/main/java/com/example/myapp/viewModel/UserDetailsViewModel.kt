package com.example.myapp.viewModel


import androidx.lifecycle.ViewModel
import com.example.myapp.models.UserInfoElement
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class UserDetailsViewModel @Inject constructor(): ViewModel() {


    fun bind(userInfoElement: UserInfoElement){
        ///TODO bind data to the view
    }


}