package com.example.myapp

import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.databinding.RecyclerListRowBinding
import com.example.myapp.models.UserInfoElement

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