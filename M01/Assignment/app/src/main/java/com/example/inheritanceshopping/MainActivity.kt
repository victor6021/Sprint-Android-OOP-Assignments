package com.example.inheritanceshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritanceshopping.adapter.ShoppingListAdapter
import com.example.inheritanceshopping.model.ShoppingItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.shopping_list_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shopping = ArrayList<ShoppingItem>()

        when (text_view_colorId) {
            1 -> text_view_name.resources.getColor(R.color.foodColor)
            2 -> text_view_name.resources.getColor(R.color.clothingColor)
            else -> text_view_name.resources.getColor(R.color.electronicColor)
        }

        if (shopping != null){
            shopping.add(ShoppingItem("Banana",1))
            shopping.add(ShoppingItem("Apple",1))
            shopping.add(ShoppingItem("T-Shirt",2))
            shopping.add(ShoppingItem("Jean",2))
            shopping.add(ShoppingItem("Television",3))
            shopping.add(ShoppingItem("Computer",3))
        }

        recycler_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ShoppingListAdapter(shopping)
        recycler_view.layoutManager = manager
        recycler_view.adapter = adapter
    }
}
