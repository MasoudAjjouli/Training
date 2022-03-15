package com.example.myapp.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myapp.R
import com.example.myapp.databinding.Fragment1Binding

class RedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = DataBindingUtil.inflate<Fragment1Binding>(inflater, R.layout.fragment1, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews(){

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

//    lateinit var binding: Fragment1Binding
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        binding = Fragment1Binding.bind(view)
//    }

}