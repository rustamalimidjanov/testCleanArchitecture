package com.example.domain.usecase

import com.example.domain.repository.Repository
import com.example.domain.models.SaveParam

class SaveUserNameUseCase(private val userRepository: Repository) {
    fun execute(param: SaveParam):Boolean {
        return userRepository.saveName(saveParam = param)
    }
}