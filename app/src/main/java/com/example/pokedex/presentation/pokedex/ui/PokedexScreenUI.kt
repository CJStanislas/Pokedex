package com.example.pokedex.presentation.pokedex.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pokedex.presentation.pokedex.state.PokedexState
import com.example.pokedex.presentation.theme.PokedexTheme
import kotlin.random.Random


@Composable
fun PokedexScreenUI(uiState: PokedexState, onPokemonClicked: (Int) -> Unit,) {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = uiState.text,
        )

        Button(onClick = {
            onPokemonClicked(Random.nextInt())}) {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PokedexTheme {
        PokedexScreenUI(
            uiState = PokedexState(text = "Hello world"),
            onPokemonClicked = {}
        )
    }
}
