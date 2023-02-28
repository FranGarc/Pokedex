package com.franciscogarciagarzon.data.remote.model


import com.google.gson.annotations.SerializedName

data class OfficialArtwork(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)