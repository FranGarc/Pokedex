package com.franciscogarciagarzon.data.remote.model


import com.google.gson.annotations.SerializedName

data class PokeApiResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val entries: List<Entry>
)