package com.example.rickandmorty.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.rickandmorty.jsonstructures.CharacterBasic
import com.example.rickandmorty.model.repository.CharactersRepository
import com.example.scripts.GetNameAndImageOfCharactersQuery

class CharactersViewModel : ViewModel() {

    lateinit var charactersBasicLiveData: LiveData<List<CharacterBasic>>
    private val charactersRepository = CharactersRepository()

    fun fetchAllCharacters() {
        charactersBasicLiveData = charactersRepository.getCharacterNameAndImage()
    }
}