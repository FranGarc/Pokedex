package com.franciscogarciagarzon.domain.model

data class Pokemon(
    val species: String,
    val height: Double,
    val weight: Double,
    val types: Set<PokemonType>,
    val stats: Stats,
    val defaultSprites: Sprites,
) {
    constructor(
        species: String,
        height: Double,
        weight: Double,
        type: PokemonType,
        stats: Stats,
        defaultSprites: Sprites,
    ) : this(
        species,
        height,
        weight,
        setOf(type),
        stats,
        defaultSprites,
    )
}


