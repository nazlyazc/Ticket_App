package com.example.data.remote

import androidx.datastore.preferences.protobuf.Value
import com.example.data.dto.CredentialsDto
import com.example.data.dto.RefreshRequestDto
import com.example.data.dto.TokenPairDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST(value = "/auth/login")
    suspend fun login(@Body body: CredentialsDto): TokenPairDto
    @POST(value = "/auth/login")
    suspend fun register(@Body body: CredentialsDto): TokenPairDto
    @POST(value = "/auth/login")
    suspend fun refresh(@Body body: RefreshRequestDto): TokenPairDto
}