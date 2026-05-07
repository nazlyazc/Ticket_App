package com.example.data.network

import android.graphics.Mesh
import android.os.Message

class NetworkException (cause: Throwable) : RuntimeException("Network Error", cause)

class ApiException(
    val code : Int,
    val errorMessage: String,
    cause: Throwable? = null
) : RuntimeException("HTTP $code: $errorMessage",cause)