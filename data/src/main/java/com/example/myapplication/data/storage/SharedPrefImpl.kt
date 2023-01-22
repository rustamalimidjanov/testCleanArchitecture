package com.example.myapplication.data.storage

import android.content.Context
import com.example.myapplication.data.storage.models.User

const val SHARED_PREFERENCE = "shared_preference"
const val SHARED_PREFERENCE_FIRSTNAME = "shared_preference_firstname"
const val SHARED_PREFERENCE_LASTNAME = "shared_preference_lastname"

class SharedPrefImpl(context: Context): SharedPrefRepository {

    private val sharedPreference = context.getSharedPreferences(SHARED_PREFERENCE, Context.MODE_PRIVATE)

    override fun saveName(user: User): Boolean {
        sharedPreference.edit()
            .putString(SHARED_PREFERENCE_FIRSTNAME, user.firstName)
            .apply()
        sharedPreference.edit()
            .putString(SHARED_PREFERENCE_LASTNAME, user.lastName)
            .apply()
        return true
    }

    override fun getName(): User {
        val firstName = sharedPreference.getString(SHARED_PREFERENCE_FIRSTNAME, "defValue") ?: "defValue"
        val lastName = sharedPreference.getString(SHARED_PREFERENCE_LASTNAME, "defValue") ?: "defValue"
        return User(
            firstName = firstName,
            lastName = lastName,
        )
    }
}