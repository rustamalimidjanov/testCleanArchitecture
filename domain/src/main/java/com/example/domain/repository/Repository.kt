package com.example.domain.repository

import com.example.domain.models.SaveParam
import com.example.domain.models.UserName

interface Repository {
    fun saveName(saveParam: SaveParam): Boolean
    fun getName(): SaveParam
}