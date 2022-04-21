package com.example.myapp.fragments


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp.R
import com.example.myapp.RecycleViewAdapter
import com.example.myapp.UserClickListener
import com.example.myapp.databinding.RecyclerListRowBinding
import com.example.myapp.databinding.YellowFragmentBinding
import com.example.myapp.models.UserInfoElement
import com.example.myapp.viewModel.WelcomeViewModel

class YellowFragment : Fragment(), UserClickListener {
    private lateinit var binding: YellowFragmentBinding
    private lateinit var recyclerAdapter: RecycleViewAdapter
    private val viewModel by lazy { ViewModelProvider(this).get(WelcomeViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate<YellowFragmentBinding>(
            inflater,
            R.layout.yellow_fragment, container, false
        )
        initView()
        initeViewModel()
        return binding.root

    }
    private fun initView() {

        val yellowFragment = this
        recyclerAdapter = RecycleViewAdapter(yellowFragment)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = RecycleViewAdapter(this)
        recyclerView.adapter = recyclerAdapter

    }

    private fun initeViewModel() {
        viewModel.getRecyclerListObserver().observe(viewLifecycleOwner) {
            it?.let {
                recyclerAdapter.setUpdatedData(it)
            } ?: Toast.makeText(activity, "Error in getting data", Toast.LENGTH_SHORT)
        }
        viewModel.makeApiCall()

    }

    override fun onClick(User: UserInfoElement) {

        val action = BaseFragmentDirections.actionBaseFragmentToUserDetails(User.fullName,User.emailAddress)
        findNavController().navigate(action)

    }

    companion object {
        fun newInstance() = YellowFragment()
    }

}



// val bundle = Bundle()
//        bundle.putString("data",User.fullName)
//        bundle.putString("data2",User.emailAddress)
//        val fragment = UserDetails()
//        fragment.arguments = bundle

//       // val userFragment = UserDetails()
////        val fragment = UserDetails().newInstance(User.fullName)
////        val fragment2 = UserDetails().newInstance(User.emailAddress)
//      //  val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
////        transaction.replace(R.id.baseFragment,UserDetails())
////        transaction.commit()
//

//        fragmentManager?.beginTransaction()?.replace(R.id.baseFrag,fragment)?.commit()
//
////        TODO("navigate to new fragment using navigation components " +
////            "send the user details to the new fragment" +
////            "name the fragment - User details" +
////            "display the details in the new fragment")
//

