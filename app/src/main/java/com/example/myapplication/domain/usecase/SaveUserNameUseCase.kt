package com.example.myapplication.domain.usecase

import com.example.myapplication.domain.models.SaveParam

class SaveUserNameUseCase {
    fun execute(param: SaveParam):Boolean {
        if(param.name.isEmpty()) return false
        return true
    }
}