package com.example.pokedex.presentation.pokedex.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.pokedex.presentation.pokedex.viewmodel.PokedexViewModel
import com.example.pokedex.presentation.theme.PokedexTheme


@Composable
fun PokedexScreen(viewModel: PokedexViewModel = hiltViewModel()) {

    val uiState by viewModel.uiState.collectAsState()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        Column {
            Text(
                text = uiState.text,
                modifier = Modifier.padding(innerPadding)
            )

            Button(onClick = { viewModel.test()}) { }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PokedexTheme {
        PokedexScreen()
    }
}
