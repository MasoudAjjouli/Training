package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.databinding.RecyclerListRowBinding
import com.example.myapp.models.RecyclerData
import com.squareup.picasso.Picasso
import java.util.ArrayList

class RecycleViewAdapter : RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>() {



    var items = ArrayList<RecyclerData>()
    fun setUpdatedData(items: ArrayList<RecyclerData>){

        this.items = items
        notifyDataSetChanged()
    }
    class MyViewHolder(view:View): RecyclerView.ViewHolder(view){
        val fullName = view.findViewById<TextView>(R.id.FullName)
        val emailAdress = view.findViewById<TextView>(R.id.emailAddress)
        fun bind(data: RecyclerData){
            fullName.text =data.fullName
            emailAdress.text =data.emailAddress

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_row,parent,false)
        return  MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }
}