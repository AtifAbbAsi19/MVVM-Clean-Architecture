package com.inc.clean_architecturemvvm.network.networkstates

sealed class ApiState<out R> {

    object Idle : ApiState<Nothing>()

    object Loading : ApiState<Nothing>()

    class Failure(val msg: String) : ApiState<Nothing>()

    class Success<out R>(val response: R) : ApiState<R>()

}