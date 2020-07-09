package com.example.bus_timetable_retrofit_kotlin_application

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    @SerializedName("results")
    val result: List<Result>
)

data class Result(
    @SerializedName("duetime")
    val duetime: String
)