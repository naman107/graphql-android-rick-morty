package com.example.rickandmorty.jsonstructures

data class CharacterDetails(
    val id: Int,
    val name: String,
    val status: String?,
    val species: String?,
    val gender: String?,
    val origin: Origin?,
    val location: Location?,
    val image: String?,
    val url: String?,
    val created: String?
)

data class Origin(
    val name: String?,
    val url: String?
)

data class Location(
    val name: String?,
    val url: String?
)


