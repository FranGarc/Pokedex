package com.franciscogarciagarzon.data.remote.model


import com.google.gson.annotations.SerializedName

data class Entry(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)