package com.example.pokedex.presentation.pokedex.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pokedex.presentation.pokedex.state.PokedexState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PokedexViewModel @Inject constructor(): ViewModel() {
    private val _uiState = MutableStateFlow(PokedexState())
    val uiState: StateFlow<PokedexState> = _uiState.asStateFlow()
}

