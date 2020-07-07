package com.example.bus_timetable_retrofit_kotlin_application

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    @SerializedName("name")
    val name: String,
    @SerializedName("role")
    val role: String?,
    @SerializedName("orderOfThePhoenix")
    val orderOfThePhoenix: Boolean
)