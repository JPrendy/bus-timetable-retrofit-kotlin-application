package com.example.bus_timetable_retrofit_kotlin_application


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_character_viewholder.view.*

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    private val characterList = mutableListOf<Result>()

    fun setCharacterList(characterList: List<Result>) {
        this.characterList.clear()
        this.characterList.addAll(characterList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_character_viewholder,
            parent, false)
        return CharacterViewHolder(view)
    }

    override fun getItemCount() = characterList.size

    @SuppressLint("DefaultLocale")
    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characterList[position]
        with(holder) {
            characterNameTextView.text = String.format(characterNameTextView.context.getString(R.string
                .buss_placeholder), character.duetime)
        }
    }

    inner class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val characterNameTextView: TextView = itemView.character_name_textview
        val characterRoleTextView: TextView = itemView.character_role_textview


    }
}