package com.example.pokedex.module

import com.example.pokedex.data.repository.PokeAPIRepository
import com.example.pokedex.domain.repository.PokeAPIRepositoryImpl
import dagger.Binds
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

@Module
@InstallIn(SingletonComponent::class)
abstract class PokeAPIModule {

    @Binds
    abstract fun bindPokeAPIRepository(impl: PokeAPIRepositoryImpl): PokeAPIRepository
}
