package com.example.pokedex.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface AppDestination : NavKey {
    @Serializable
    data object PokedexScreen: AppDestination
    @Serializable
    data class PokemonDetailScreen(val id: Int): AppDestination
}

