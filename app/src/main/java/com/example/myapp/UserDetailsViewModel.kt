package com.example.myapp


import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.myapp.models.UserInfoElement
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class UserDetailsViewModel @Inject constructor(
    private val state: SavedStateHandle
): ViewModel() {

    private val task = state.get<UserInfoElement>("currentUser")

    var taskName = state.get<String>("taskName") ?: task?.fullName ?: ""
        set(value) {
            field = value
            state.set("taskName", value)
        }

    var taskEmail= state.get<String>("taskEmail") ?: task?.emailAddress ?: ""
        set(value) {
            field = value
            state.set("taskEmail", value)
        }

    var taskBio= state.get<String>("taskBio") ?: task?.bio ?: ""
        set(value) {
            field = value
            state.set("taskBio", value)
        }
}