//package com.example.myapp
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.myapp.models.UserInfoElement
//import java.util.ArrayList
//
//class CardAdapter: RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>() {
//    var items = ArrayList<UserInfoElement>()
//    fun setUpdatedData(items: List<UserInfoElement>){
//        this.items.addAll(items)
//        notifyDataSetChanged()
//    }
//    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
//        val fullName = view.findViewById<TextView>(R.id.FullName)
//        val emailAdress = view.findViewById<TextView>(R.id.emailAddress)
//        fun bind(data: UserInfoElement){
//            fullName.text =data.fullName
//            emailAdress.text =data.emailAddress
//
//        }
//    }
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewAdapter.MyViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_row,parent,false)
//        return RecycleViewAdapter.MyViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: RecycleViewAdapter.MyViewHolder, position: Int) {
//        holder.bind(items[position])
//    }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//}