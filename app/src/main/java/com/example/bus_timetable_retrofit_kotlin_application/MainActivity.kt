package com.example.bus_timetable_retrofit_kotlin_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    private lateinit var characterAdapter: CharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        // Switch to AppTheme for displaying the activity
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Important Intent, we getting the value we passed over from `StartActivity`
        var message = intent.getIntExtra(EXTRA_MESSAGE, 7602)
        //Might need this for testing
//        if( message == null) {
//            message = 1762.toString()
//        }

        characterAdapter = CharacterAdapter()
        character_recyclerview.adapter = characterAdapter

        val dataApi = Retrofit.Builder()
            .baseUrl((application as BusApp).getBaseUrl())
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .client(OkHttpProvider.getOkHttpClient())
            .build()
            .create(BusApi::class.java)

        dataApi.getCharacters(message).enqueue(object : Callback<CharacterModel> {
            override fun onFailure(call: Call<CharacterModel>, t: Throwable) {
                showErrorState()
            }

            override fun onResponse(call: Call<CharacterModel>,
                                    response: Response<CharacterModel>) {
                if (response.isSuccessful && response.body() != null) {
                    val characterList = response.body()!!.result
                        showCharacterList(characterList)
                } else {
                    showErrorState()
                }
            }
        })
    }

    private fun showCharacterList(characterList: List<Result>) {
        character_recyclerview.visibility = View.VISIBLE
        progress_bar.visibility = View.GONE
        textview.visibility = View.GONE
        characterAdapter.setCharacterList(characterList)
    }

    private fun showErrorState() {
        character_recyclerview.visibility = View.GONE
        progress_bar.visibility = View.GONE
        textview.visibility = View.VISIBLE
        textview.text = getString(R.string.something_went_wrong)
    }

}
