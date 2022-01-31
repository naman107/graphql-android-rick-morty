package com.example.rickandmorty.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.databinding.ListItemBinding
import com.example.rickandmorty.jsonstructures.CharacterBasic
import com.example.rickandmorty.viewholders.CharactersViewHolder
import com.example.scripts.GetNameAndImageOfCharactersQuery

class CharactersAdapter(val listOfCharacters: List<CharacterBasic>): RecyclerView.Adapter<CharactersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater)
        return CharactersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.bind(listOfCharacters.get(position))
    }

    override fun getItemCount(): Int {
        return listOfCharacters.size
    }

}