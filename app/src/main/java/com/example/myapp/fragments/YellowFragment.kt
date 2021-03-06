package com.example.myapp.fragments

import android.content.Context
import android.content.Intent
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
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp.CellDetail
import com.example.myapp.R
import com.example.myapp.RecycleViewAdapter
import com.example.myapp.UserClickListener
import com.example.myapp.databinding.YellowFragmentBinding
import com.example.myapp.models.USER_ID
import com.example.myapp.models.UserInfo
import com.example.myapp.models.UserInfoElement
import com.example.myapp.viewModel.WelcomeViewModel
import java.util.ArrayList

class YellowFragment : Fragment() , UserClickListener{
    private lateinit var binding: YellowFragmentBinding
    private lateinit var recyclerAdapter: RecycleViewAdapter
    private val viewModel by lazy {  ViewModelProvider(this).get(WelcomeViewModel::class.java)}


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
         binding = DataBindingUtil.inflate<YellowFragmentBinding>(inflater,
            R.layout.yellow_fragment,container,false)
        initView()
        initeViewModel()
        return binding.root

    }

    private fun initView() {

        val yellowFragment = this
        recyclerAdapter = RecycleViewAdapter(yellowFragment)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = RecycleViewAdapter(yellowFragment)
        recyclerView.adapter = recyclerAdapter
    }

    private fun initeViewModel(){
        viewModel.getRecyclerListObserver().observe(viewLifecycleOwner) {
            it?.let {
                recyclerAdapter.setUpdatedData(it)
            } ?: Toast.makeText(activity, "Error in getting data", Toast.LENGTH_SHORT)
        }
        viewModel.makeApiCall()



    }
    override fun onClick (User: UserInfoElement) {

        val intent = Intent(activity,CellDetail::class.java)
        intent.putExtra(USER_ID,User.id)
        startActivity(intent)


    }

    companion object {
        fun newInstance()= YellowFragment()
    }


}

