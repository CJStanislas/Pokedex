package com.example.pokedex.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.rememberSceneSetupNavEntryDecorator
import com.example.pokedex.presentation.pokedex.ui.PokedexScreenUI
import com.example.pokedex.presentation.pokedex.viewmodel.PokedexViewModel
import com.example.pokedex.presentation.pokemonDetail.ui.PokemonDetailScreenUI
import com.example.pokedex.presentation.pokemonDetail.viewmodel.PokemonDetailViewModel


@Composable
fun NavigationRoot(
    modifier: Modifier = Modifier,
) {
    val backStack = rememberNavBackStack(AppDestination.PokedexScreen)

    NavDisplay(
        modifier = modifier,
        backStack = backStack,
        entryDecorators = listOf(
            rememberSavedStateNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator(),
            rememberSceneSetupNavEntryDecorator()
        ),
        entryProvider = entryProvider {
            entry<AppDestination.PokedexScreen> {
                val viewModel: PokedexViewModel = hiltViewModel()
                val uiState by viewModel.uiState.collectAsState()

                PokedexScreenUI(
                    uiState = uiState,
                    onPokemonClicked = { id ->
                        backStack.add(AppDestination.PokemonDetailScreen(id))
                    }
                )
            }
            entry<AppDestination.PokemonDetailScreen> { key ->
                val viewModel = hiltViewModel<PokemonDetailViewModel, PokemonDetailViewModel.Factory>(
                    creationCallback = { factory -> factory.create(key.id)}
                )
                val uiState by viewModel.uiState.collectAsState()

                PokemonDetailScreenUI(uiState = uiState)
            }
        },
    )
}
