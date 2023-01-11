package com.example.myapplication.domain

import com.example.myapplication.domain.models.SaveParam

interface Repository {
    fun saveName(param: SaveParam)
    fun getName()
}