package com.walletwizard.data

import com.walletwizard.domain.model.basedto.BaseDto
import retrofit2.http.GET

interface ApiServer {
    @GET ("531/db.json")
    suspend fun getDataDb () : BaseDto
}