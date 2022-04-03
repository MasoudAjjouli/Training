package com.example.myapp.models

data class RecyclerList(val items: ArrayList<RecyclerData>)
data class RecyclerData( val Friends : String,
                         val address: String,
                         val bio: String,
                         val emailAddress: String,
                         val fullName: String,
                         val id: Int,
                         val interests: String,
                         val jobTitle: String,
                         val phoneNumber: String)
