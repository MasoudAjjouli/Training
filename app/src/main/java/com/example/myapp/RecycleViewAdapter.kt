package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.databinding.RecyclerListRowBinding
import com.example.myapp.models.UserInfo
import com.example.myapp.models.UserInfoElement
import java.util.ArrayList

class RecycleViewAdapter(
    private val clickListener: UserClickListener
) : RecyclerView.Adapter<RecycleViewAdapter.CardViewHolder>() {
   // private lateinit var recyclerListRowBinding: RecyclerListRowBinding
    var items = ArrayList<UserInfoElement>()
    fun setUpdatedData(items: List<UserInfoElement>){
        this.items.addAll(items)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = RecyclerListRowBinding.inflate(from,parent,false)
        return  CardViewHolder(binding,clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindUser(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class CardViewHolder(
        private val recyclerListRowBinding: RecyclerListRowBinding,
        private val clickListener: UserClickListener
    ): RecyclerView.ViewHolder(recyclerListRowBinding.root) {

        fun bindUser(User :UserInfoElement){
            recyclerListRowBinding.fullName.text= User.fullName
            recyclerListRowBinding.emailAddress.text = User.emailAddress

            recyclerListRowBinding.cardView.setOnClickListener{
                clickListener.onClick(User)
            }
        }
    }
}