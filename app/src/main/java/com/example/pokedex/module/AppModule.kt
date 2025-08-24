package com.example.pokedex.module

import com.example.pokedex.data.repository.PokeAPIRepository
import com.example.pokedex.domain.repository.PokeAPIRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class PokeAPIModule {

    @Binds
    abstract fun bindPokeAPIRepository(impl: PokeAPIRepositoryImpl): PokeAPIRepository
}
