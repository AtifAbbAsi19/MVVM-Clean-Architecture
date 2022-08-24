package com.inc.clean_architecturemvvm.network

import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers


/*fun <T, A> resultLiveData(databaseQuery: () -> LiveData<T>,
                          networkCall: suspend () -> Result<A>,
                          saveCallResult: suspend (A?) -> Unit): LiveData<Result<T>> =
    liveData(Dispatchers.IO) {
        emit(Result.loading())
        val source = databaseQuery.invoke().map { Result.success(it) }
        emitSource(source)

        val responseStatus = networkCall.invoke()
        if (responseStatus.status == Result.Status.SUCCESS) {
            saveCallResult(responseStatus.data)
        } else if (responseStatus.status == Result.Status.ERROR) {
            emit(Result.error<T>(responseStatus.message ?: "Unknown error"))
            emitSource(source)
        }
    }*/
