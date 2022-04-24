package com.example.myapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.myapp.R
import com.example.myapp.databinding.UserDetailsFragmentBinding
import com.example.myapp.databinding.YellowFragmentBinding

class UserDetailsFragment : Fragment() {

    private val args: UserDetailsFragmentArgs by navArgs()
    private lateinit var binding: UserDetailsFragmentBinding

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

        initView()
        return binding.root

    }


    private fun initView() {

//        binding.fullName.text = args.currentUser?.fullName
//        binding.emailAddress.text = args.currentUser?.emailAddress
//        binding.bio.text = args.currentUser?.bio
    }
}
