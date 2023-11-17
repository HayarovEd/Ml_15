package com.walletwizard.data

import android.util.Log
import com.walletwizard.domain.RepositoryServer
import javax.inject.Inject
import com.walletwizard.domain.model.basedto.BaseDto
import com.walletwizard.data.Resource.Error
import com.walletwizard.data.Resource.Success

class RepositoryServerImpl @Inject constructor(
    private val apiServer: ApiServer
) : RepositoryServer {
    override suspend fun getDataDb(): Resource<BaseDto> {
        return try {
            val folder = apiServer.getDataDb()
            Log.d("DATADB", "dATA DB:${folder.loans.first().id}")
            Success(
                data = folder
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Error(e.message ?: "An unknown error")
        }
    }
}