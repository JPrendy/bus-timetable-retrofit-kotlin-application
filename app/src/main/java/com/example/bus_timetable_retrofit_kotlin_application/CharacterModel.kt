package com.example.bus_timetable_retrofit_kotlin_application

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

//Gson implementation version
//data class CharacterModel(
//    @SerializedName("results")
//    val result: List<Result>
//)
//
//data class Result(
//    @SerializedName("duetime")
//    val duetime: String,
//
//    @SerializedName("route")
//    val route: String
//)

//Moshi implementation version
data class CharacterModel(
    @field:Json(name = "results") val result: List<Result>
)

data class Result(
    @field:Json(name = "duetime") val duetime: String,

    @field:Json(name = "route") val route: String
)