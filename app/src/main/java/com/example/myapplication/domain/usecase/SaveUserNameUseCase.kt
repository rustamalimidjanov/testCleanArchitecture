package com.example.myapplication.domain.usecase

import com.example.myapplication.domain.Repository
import com.example.myapplication.domain.models.SaveParam

class SaveUserNameUseCase(private val userRepository: Repository) {
    fun execute(param: SaveParam):Boolean {
        return userRepository.saveName(saveParam = param)
    }
}