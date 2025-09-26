package com.example.pokedex.presentation.pokemonDetail.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pokedex.presentation.pokemonDetail.state.PokemonDetailState
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel(assistedFactory = PokemonDetailViewModel.Factory::class)
class PokemonDetailViewModel @AssistedInject constructor(@Assisted private val id: Int): ViewModel() {

    @AssistedFactory
    interface Factory {
        fun create(id: Int): PokemonDetailViewModel
    }

    private val _uiState = MutableStateFlow(PokemonDetailState(id = id))
    val uiState: StateFlow<PokemonDetailState> = _uiState.asStateFlow()
}

