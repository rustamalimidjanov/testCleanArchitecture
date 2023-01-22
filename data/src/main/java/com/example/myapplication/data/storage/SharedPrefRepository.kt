package com.example.myapplication.data.storage

import com.example.myapplication.data.storage.models.User

interface SharedPrefRepository {
    fun saveName(user: User): Boolean
    fun getName(): User
}