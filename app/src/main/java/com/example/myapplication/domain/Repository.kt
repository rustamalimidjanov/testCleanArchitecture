package com.example.myapplication.domain

import com.example.myapplication.domain.models.SaveParam
import com.example.myapplication.domain.models.UserName

interface Repository {
    fun saveName(saveParam: SaveParam): Boolean
    fun getName(): UserName
}