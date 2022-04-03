package com.example.myapp.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapp.models.RecyclerList
import com.example.myapp.network.RetroInstance
import com.example.myapp.network.RetroService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WelcomeViewModel: ViewModel(){
    lateinit var recyclerListLiveData: MutableLiveData<RecyclerList>

    init{
        recyclerListLiveData = MutableLiveData()
    }
    fun getRecyclerListObserver(): MutableLiveData<RecyclerList>{
        return recyclerListLiveData
    }
    fun makeApiCall(){
        viewModelScope.launch{
           val retroInstance =  RetroInstance.getRetroInstance().create(RetroService::class.java)
            val responce = retroInstance.getDataFromApi("n")
            recyclerListLiveData.postValue(responce)

        }
    }
}