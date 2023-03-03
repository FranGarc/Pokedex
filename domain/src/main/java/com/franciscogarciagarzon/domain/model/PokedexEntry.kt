package com.franciscogarciagarzon.domain.model

data class PokedexEntry(val id: Int, val pokemon: Pokemon) {
    constructor(
        id: Int,
        species: String,
        height: Double,
        weight: Double,
        type: PokemonType,
        stats: Stats,
        defaultSprites: Sprites,
    ) : this(
        id,
        Pokemon(
            species,
            height,
            weight,
            setOf(type),
            stats,
            defaultSprites,
        )
    )

    val species: String
        get() = this.pokemon.species
    val height: Double
        get() = this.pokemon.height
    val weight: Double
        get() = this.pokemon.weight
    val types: Set<PokemonType>
        get() = this.pokemon.types
    val stats: Stats
        get() = this.pokemon.stats
    val defaultSprites: Sprites
        get() = this.pokemon.defaultSprites
}