package com.debk007.template.util

sealed class ApiState<T>(
    val data: T? = null,
    val errorMsg: String? = null
) {
    class Success<T>(data: T?) : ApiState<T>(data = data)

    class Error<T>(msg: String) : ApiState<T>(errorMsg = msg)

    class Loading<T> : ApiState<T>()
}