package com.example.core.domain

import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    val isLoggedIn: Flow<Boolean>

    suspend fun login(email: String, password: String): Result<AuthSession>
    suspend fun register(fullName: String, email: String, password: String): Result<Unit>
    suspend fun logout(): Result<Unit>
}
