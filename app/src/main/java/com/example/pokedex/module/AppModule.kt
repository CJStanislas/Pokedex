package com.example.pokedex.module

import com.example.pokedex.data.repository.PokeAPIRepository
import com.example.pokedex.domain.repository.PokeAPIRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindPokeAPIRepository(impl: PokeAPIRepositoryImpl): PokeAPIRepository
}
