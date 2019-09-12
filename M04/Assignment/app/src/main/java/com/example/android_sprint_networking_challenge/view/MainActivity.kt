package com.example.android_sprint_networking_challenge.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android_sprint_networking_challenge.R
import com.example.android_sprint_networking_challenge.databinding.ActivityMainBinding
import com.example.android_sprint_networking_challenge.model.Pokemon
import com.example.android_sprint_networking_challenge.viewModel.PokemonViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var pokemonList = mutableListOf<Pokemon>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO 5: Update your MainActivity to use DataBindingUtil to show the UI, rather than the regular setContentView
        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        activityMainBinding.viewModel = PokemonViewModel()
                activityMainBinding.executePendingBindings()

        image_view_search.setOnClickListener {
            val value = edit_text.text
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("value", value)
            startActivity(intent)
        }
    }
        fun refreshList(){
            layout.removeAllViews()
            for((counter, pokemon) in pokemonList.withIndex()){
                layout.addView(pokemonListView(pokemon, counter))
            }
        }

        override fun onPostResume() {
            refreshList()
            super.onPostResume()
        }

        fun pokemonListView(pokemon: Pokemon, index: Int): TextView {
            var newPokemon = TextView(this)
            newPokemon.textSize = 24f
            newPokemon.id = index
            newPokemon.text = pokemon.name

            newPokemon.setOnClickListener {
                pokemonList.removeAt(newPokemon.id)
            }
            return newPokemon
        }
    }

