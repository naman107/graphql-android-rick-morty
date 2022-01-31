package com.example.rickandmorty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rickandmorty.adapters.CharactersAdapter
import com.example.rickandmorty.databinding.ActivityMainBinding
import com.example.rickandmorty.viewmodel.CharactersViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var charactersViewModel: CharactersViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
        initDataBinding()
        fetchAllCharacters()
        observerEvents()
    }

    private fun initViewModel(){
        charactersViewModel = ViewModelProvider(this).get(CharactersViewModel::class.java)
        binding.characterRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun initDataBinding(){
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    }

    private fun observerEvents(){
        charactersViewModel.charactersBasicLiveData.observe(this, {
            var listOfCharacters = it
            binding.characterRecyclerView.adapter = CharactersAdapter(it)
        })
    }

    private fun fetchAllCharacters(){
        charactersViewModel.fetchAllCharacters()
    }

}
