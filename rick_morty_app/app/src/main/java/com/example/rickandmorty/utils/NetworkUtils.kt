package com.example.rickandmorty.utils

import androidx.lifecycle.MutableLiveData
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.example.rickandmorty.jsonstructures.CharacterBasic
import com.example.scripts.GetNameAndImageOfCharactersQuery

class NetworkUtils {

    companion object {

        const val BASE_URL: String = "http://192.168.1.6:3000/graphql"

        fun getApolloClient()
        :
        ApolloClient{
            return ApolloClient.builder()
                .serverUrl(BASE_URL)
                .build()
        }

        fun getResponsesFromGetNameAndImageQuery(response: Response<GetNameAndImageOfCharactersQuery.Data>)
        :
        MutableList<CharacterBasic> {
            val mResponse : GetNameAndImageOfCharactersQuery.Characters? = response?.data?.characters
            var mList = mutableListOf<CharacterBasic>()
            mResponse?.results?.forEach {
                mList.add(CharacterBasic(it?.id!!,it.name,it.image))
            }
            return mList
        }
    }

}