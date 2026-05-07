package com.example.ticketapp.ui.login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.domain.AuthRepository
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: AuthRepository) : ViewModel() {
    fun loginTest() {
        viewModelScope.launch {
            val result = repository.login("nazlyazc1@gmail.com", "android123#")

            result.onSuccess { session ->
                Log.d("TicketApp", "Giriş Başarılı! Token: ${session.accessToken}")
            }.onFailure { error ->
                Log.e("TicketApp", "Hata Oluştu: ${error.message}")
            }
        }
    }
}