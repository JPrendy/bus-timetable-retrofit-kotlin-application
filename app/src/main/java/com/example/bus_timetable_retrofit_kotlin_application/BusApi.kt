package com.example.bus_timetable_retrofit_kotlin_application

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface BusApi {

    //Old Version
//    @GET("cgi-bin/rtpi/realtimebusinformation?stopid=7602&format=json")
//    fun getCharacters(): Call<CharacterModel>

    //New Version
    @GET("cgi-bin/rtpi/realtimebusinformation")
    fun getCharacters(@Query("stopid") id: Int): Call<CharacterModel>
}

// TODO : paste below your API key as a String value. You can get it from https://www.potterapi.com/
//  (do not forget to escape $ characters with a backslash if needed)
val API_KEY = ""
