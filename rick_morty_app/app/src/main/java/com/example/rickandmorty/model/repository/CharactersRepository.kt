package com.example.rickandmorty.model.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.example.rickandmorty.jsonstructures.CharacterBasic
import com.example.rickandmorty.utils.NetworkUtils
import com.example.scripts.GetNameAndImageOfCharactersQuery

class CharactersRepository {

    private val TAG = "CharactersRepository"
    var characterBasicLiveData = MutableLiveData<List<CharacterBasic>>()

    fun getCharacterNameAndImage()
    :
    MutableLiveData<List<CharacterBasic>>{
        val apolloClient: ApolloClient = NetworkUtils.getApolloClient()
        apolloClient.query(GetNameAndImageOfCharactersQuery())
            .enqueue(object: ApolloCall.Callback<GetNameAndImageOfCharactersQuery.Data>(){
                override fun onResponse(response: Response<GetNameAndImageOfCharactersQuery.Data>) {
                    val mList = NetworkUtils.getResponsesFromGetNameAndImageQuery(response)
                    characterBasicLiveData.postValue(mList)
                }
                override fun onFailure(e: ApolloException) {
                    Log.d(TAG, "onFailure: " + e.printStackTrace())
                }
            })

        return characterBasicLiveData
    }

}
