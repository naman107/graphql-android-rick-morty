package com.example.rickandmorty.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.R
import com.example.rickandmorty.databinding.ListItemBinding
import com.example.rickandmorty.jsonstructures.CharacterBasic
import com.squareup.picasso.Picasso

class CharactersViewHolder(private val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(characterItem: CharacterBasic){
        binding.characterNameTextView.text = characterItem.name
        Picasso.get().load(characterItem.image).into(binding.characterImageImageView);
    }

}