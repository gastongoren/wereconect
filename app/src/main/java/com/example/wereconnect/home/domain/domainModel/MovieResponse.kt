package com.example.wereconnect.home.domain.domainModel

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("results")
    val results: List<Results>
) {
    data class Results(
        @SerializedName("locations") val locations: List<Locations>,
        @SerializedName("weight") val weight: Int,
        @SerializedName("id") val id: String,
        @SerializedName("picture") val picture: String,
        @SerializedName("provider") val provider: String,
        @SerializedName("name") val name: String
    ) {
        data class Locations(
            @SerializedName("display_name") val display_name: String,
            @SerializedName("id") val id: String,
            @SerializedName("url") val url: String,
            @SerializedName("name") val name: String,
            @SerializedName("icon") val icon: String
        )
    }
}