package com.example.myapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.myapp.R
import com.example.myapp.UserDetailsViewModel
import com.example.myapp.databinding.UserDetailsFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserDetailsFragment : Fragment() {

    private val args: UserDetailsFragmentArgs by navArgs()
    private lateinit var binding: UserDetailsFragmentBinding
    private val viewModel :UserDetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate<UserDetailsFragmentBinding>(
            inflater,
            R.layout.user_details_fragment,
            container,
            false
        )

        viewModel
        initView()

        return binding.root

    }

    private fun initView() {

        binding.apply {
            fullName.text = viewModel.taskName
            emailAddress.text = viewModel.taskEmail
            bio.text = viewModel.taskBio
        }

//        binding.fullName.text = args.currentUser?.fullName
//        binding.emailAddress.text = args.currentUser?.emailAddress
//        binding.bio.text = args.currentUser?.bio
    }
}
