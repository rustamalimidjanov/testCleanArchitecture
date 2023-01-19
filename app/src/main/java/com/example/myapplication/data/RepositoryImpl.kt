package com.example.myapplication.data

import android.content.Context
import com.example.myapplication.domain.Repository
import com.example.myapplication.domain.models.SaveParam
import com.example.myapplication.domain.models.UserName

const val SHARED_PREFERENCE = "shared_preference"
const val SHARED_PREFERENCE_SAVE = "shared_preference_save"
const val SHARED_PREFERENCE_GET = "shared_preference_get"

class RepositoryImpl(private val context: Context): Repository {
    private val sharedPreference = context.getSharedPreferences(SHARED_PREFERENCE, Context.MODE_PRIVATE)

    override fun saveName(saveParam: SaveParam): Boolean {
        sharedPreference.edit()
            .putString(SHARED_PREFERENCE_SAVE, saveParam.name)
            .apply()
//        if (saveParam.name.isEmpty()) return false
        return true
    }

    override fun getName(): SaveParam {
        val gname = sharedPreference.getString(SHARED_PREFERENCE_SAVE, "defValue") ?: "defValue"
        return SaveParam(name = gname)
    }

}