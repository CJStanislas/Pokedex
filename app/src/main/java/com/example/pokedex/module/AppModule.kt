package com.example.pokedex.module

import com.example.pokedex.data.repository.PokeAPIRepository
import com.example.pokedex.domain.repository.PokeAPIRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

/*@Module
object AppModule {

    @Singleton
    @Provides
    fun providePokeAPIRepository(toto: Int, titi: String): PokeAPIRepository {
        return PokeAPIRepositoryImpl(toto = toto, titi = titi)
    }

    @Provides
    fun provideToto(): Int = 3

}


@Module
abstract class Repo {

    @Singleton
    @Binds
    abstract fun providePokeAPIRepository(monq: PokeAPIRepositoryImpl): PokeAPIRepository

    @Provides
    fun provideToto(): Int = 3
}*/




