package com.example.myapp.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp.R
import com.example.myapp.RecycleViewAdapter
import com.example.myapp.WelcomeActivity
import com.example.myapp.databinding.ActivityWelcomeNewBinding
import com.example.myapp.databinding.YellowFragmentBinding
import com.example.myapp.models.RecyclerList
import com.example.myapp.viewModel.WelcomeViewModel

class YellowFragment : Fragment() {
    private lateinit var binding: YellowFragmentBinding
    private lateinit var recyclerAdapter: RecycleViewAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
         binding = DataBindingUtil.inflate<YellowFragmentBinding>(inflater,
            R.layout.yellow_fragment,container,false)
        initView()
        initeViewModel()
        return binding.root

    }

    private fun initView() {
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity,DividerItemDecoration.VERTICAL)
        binding.recyclerView.addItemDecoration(decoration)
        recyclerView.adapter = RecycleViewAdapter()
        recyclerView.adapter = recyclerAdapter
    }

    private fun initeViewModel(){
        val viewModel = ViewModelProvider(this).get(WelcomeViewModel::class.java)
        viewModel.getRecyclerListObserver().observe(viewLifecycleOwner, Observer<RecyclerList>{
            if(it !=null){
                recyclerAdapter.setUpdatedData(it.items)
            }else{
                Toast.makeText(activity,"Error in getting data",Toast.LENGTH_SHORT)
            }
        })
        viewModel.makeApiCall()
    }

    companion object {
        fun newInstance()= YellowFragment()
    }
}

