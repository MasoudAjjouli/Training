package com.example.myapp.models

import com.google.gson.annotations.SerializedName

typealias UserInfo = List<UserInfoElement>

data class UserInfoElement (
    val id: Long?,
    val bio: String?,
    val address: String?,
    @SerializedName("Friends")
    val friends: String?,
    val fullName: String?,
    val jobTitle: String?,
    val interests: String?,
    val phoneNumber: String?,
    val emailAddress: String?
)

enum class Friends {
    Age,
    Email,
    Name,
    Phone
}