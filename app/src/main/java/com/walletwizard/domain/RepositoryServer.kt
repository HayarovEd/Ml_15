package com.walletwizard.domain

import com.walletwizard.data.Resource
import com.walletwizard.domain.model.basedto.BaseDto

interface RepositoryServer {
    suspend fun getDataDb() : Resource<BaseDto>
}