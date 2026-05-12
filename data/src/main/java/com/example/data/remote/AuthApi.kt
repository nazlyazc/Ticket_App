package com.example.data.remote

import androidx.datastore.preferences.protobuf.Value
import com.example.data.dto.CredentialsDto
import com.example.data.dto.RefreshRequestDto
import com.example.data.dto.RegisterRequestDto
import com.example.data.dto.TokenPairDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST(value = "/auth/login")
    suspend fun login(@Body body: CredentialsDto): TokenPairDto
    @POST("/auth/register")
    suspend fun register(@Body body: RegisterRequestDto): TokenPairDto
    @POST(value = "/auth/refresh")
    suspend fun refresh(@Body body: RefreshRequestDto): TokenPairDto

}