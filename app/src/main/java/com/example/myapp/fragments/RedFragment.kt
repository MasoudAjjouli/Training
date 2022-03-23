package com.example.myapp.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapp.R
import com.example.myapp.databinding.RedFragmentBinding

class RedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = DataBindingUtil.inflate<RedFragmentBinding>(inflater,
            R.layout.red_fragment, container, false)
        return binding.root
    }

    companion object {
        //Shared variable
        const val TAG_KEY = "TAG_KEY"
        fun newInstance(): RedFragment = RedFragment()
    }
}