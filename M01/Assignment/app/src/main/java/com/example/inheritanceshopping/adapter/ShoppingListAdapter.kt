package com.example.inheritanceshopping.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritanceshopping.R
import com.example.inheritanceshopping.model.ShoppingItem
import kotlinx.android.synthetic.main.shopping_list_layout.view.*

class ShoppingListAdapter(val shopping: ArrayList<ShoppingItem>):
        RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val name: TextView = view.text_view_name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.shopping_list_layout, parent,false)
        return ViewHolder(viewGroup)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        }

    override fun getItemCount(): Int {
        return shopping.size
    }
}