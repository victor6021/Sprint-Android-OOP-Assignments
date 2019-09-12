package com.example.android_sprint_networking_challenge.viewModel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.android_sprint_networking_challenge.model.Pokemon

class PokemonViewModel: BaseObservable() {

    private var pokemon: Pokemon = Pokemon("","")
    @Bindable
    fun getPokemon(): String?{
        return
    }
}