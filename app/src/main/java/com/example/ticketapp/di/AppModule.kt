package com.example.ticketapp.di

import com.example.ticketapp.ui.viewmodel.LoginViewModel
import com.example.ticketapp.ui.viewmodel.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { LoginViewModel(get()) }
    viewModel { RegisterViewModel(get()) }
}