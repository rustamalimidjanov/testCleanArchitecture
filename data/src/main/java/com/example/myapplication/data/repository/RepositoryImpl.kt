package com.example.myapplication.data.repository

import com.example.domain.models.SaveParam
import com.example.domain.repository.Repository
import com.example.myapplication.data.storage.SharedPrefImpl
import com.example.myapplication.data.storage.models.User


class RepositoryImpl(private val sharedPref: SharedPrefImpl): Repository {
    override fun saveName(saveParam: SaveParam): Boolean {
        val user = User(firstName = saveParam.name, lastName = "")
        sharedPref.saveName(user = user)
        return true
    }

    override fun getName(): SaveParam {
        return SaveParam(name = sharedPref.getName().firstName)
    }


}