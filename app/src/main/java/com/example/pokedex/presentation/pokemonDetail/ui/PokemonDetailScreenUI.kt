package com.example.pokedex.presentation.pokemonDetail.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pokedex.presentation.pokemonDetail.state.PokemonDetailState

@Composable
fun PokemonDetailScreenUI(uiState: PokemonDetailState) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Pokemon detail screen with ID ::: ${uiState.id}",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonDetailScreenPreview() {
    PokemonDetailScreenUI(uiState = PokemonDetailState(id = 1))
}
