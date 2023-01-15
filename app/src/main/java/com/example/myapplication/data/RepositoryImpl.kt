package com.example.myapplication.data

import android.content.Context
import com.example.myapplication.domain.Repository
import com.example.myapplication.domain.models.SaveParam
import com.example.myapplication.domain.models.UserName

const val SHARED_PREFERENCE = "shared_preference"

class RepositoryImpl(private val context: Context): Repository {
    private val sharedPreference = context.getSharedPreferences(SHARED_PREFERENCE, Context.MODE_PRIVATE)

    override fun saveName(saveParam: SaveParam): Boolean {
        if (saveParam.name.isEmpty()) return false
        return true
    }

    override fun getName(): UserName {
        TODO("Not yet implemented")
    }

}