package com.example.android_sprint_networking_challenge.viewModel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.android_sprint_networking_challenge.model.Pokemon

class PokemonViewModel: BaseObservable() {

    private var pokemon: Pokemon = Pokemon("","","","","")

    @Bindable
    fun getName(): String?{
        return pokemon.name
    }

    @Bindable
    fun getId(): String?{
        return pokemon.id
    }

    @Bindable
    fun getSpriteUrl(): String?{
        return pokemon.spriteUrl
    }

    @Bindable
    fun getAbility(): String?{
        return pokemon.abilities
    }

    @Bindable
    fun getTypes(): String?{
        return pokemon.types
    }
}