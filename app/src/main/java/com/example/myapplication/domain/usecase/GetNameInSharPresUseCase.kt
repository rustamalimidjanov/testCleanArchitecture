package com.example.myapplication.domain.usecase

import com.example.myapplication.domain.Repository
import com.example.myapplication.domain.models.SaveParam

class GetNameInSharPresUseCase(private val userRepository: Repository) {
    fun execute(): String {
        return userRepository.getName().name
    }
}