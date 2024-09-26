package com.example.inheritanceshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritanceshopping.adapter.ShoppingListAdapter
import com.example.inheritanceshopping.model.ShoppingItem
import com.example.inheritanceshopping.model.shoppingData
import com.example.inheritanceshopping.retrofit.PlaceHolderApi
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shopping = ArrayList<ShoppingItem>()

        recycler_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ShoppingListAdapter(shopping)
        recycler_view.layoutManager = manager
        recycler_view.adapter = adapter
    }

    private getShoppingList(){
        placeHolderApi = PlaceHolderApi.Factory.create()
        placeHolderApi.getDisplayName().enqueue(object: Callback<List<ShoppingItem>>{

            override fun onFailure(call: Call<List<ShoppingItem>>, t: Throwable) {
                this@MainActivity.onFailure(throwable)
            }

            override fun onResponse(
                call: Call<List<ShoppingItem>>,
                response: Response<List<ShoppingItem>>
            ) {
                if(!response.isSuccessful){
                    .append("${shoppingData is}")
                }
            }
        })
    }
}
