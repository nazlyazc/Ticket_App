package com.example.ticketapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.core.ui.theme.TicketAppTheme
import com.example.ticketapp.ui.login.LoginViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        loginViewModel.loginTest()

        enableEdgeToEdge()
        setContent {
            TicketAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Text("Backend isteği atıldı.!")
                }
            }
        }
    }
}