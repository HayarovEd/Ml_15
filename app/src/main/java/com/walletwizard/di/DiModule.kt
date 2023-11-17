package com.walletwizard.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.walletwizard.data.RepositoryAnalyticImpl
import com.walletwizard.data.RepositoryServerImpl
import com.walletwizard.data.ServiceImpl
import com.walletwizard.data.SharedKeeperImpl
import com.walletwizard.domain.RepositoryAnalytic
import com.walletwizard.domain.RepositoryServer
import com.walletwizard.domain.Service
import com.walletwizard.domain.SharedKeeper
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class DiModule {

    @Binds
    @Singleton
    abstract fun bindService(service: ServiceImpl): Service

    @Binds
    @Singleton
    abstract fun bindKeeper(sharedKeeper: SharedKeeperImpl): SharedKeeper

    @Binds
    @Singleton
    abstract fun bindRepositoryAnalytic(repository: RepositoryAnalyticImpl): RepositoryAnalytic

    @Binds
    @Singleton
    abstract fun bindRepositoryServer(repository: RepositoryServerImpl): RepositoryServer

}