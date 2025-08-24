package com.example.pokedex.module

import com.example.pokedex.data.repository.PokeAPIRepository
import com.example.pokedex.domain.repository.PokeAPIRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokeAPIRepository(): PokeAPIRepository {
        return PokeAPIRepositoryImpl()
    }
}
