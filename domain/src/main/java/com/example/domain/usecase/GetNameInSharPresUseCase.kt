package com.example.domain.usecase

import com.example.domain.repository.Repository


class GetNameInSharPresUseCase(private val userRepository: Repository) {
    fun execute(): String {
        return userRepository.getName().name
    }
}