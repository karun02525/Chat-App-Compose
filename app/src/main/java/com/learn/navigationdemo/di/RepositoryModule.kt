package com.learn.navigationdemo.di

import com.learn.navigationdemo.data.repository.ChatsRepositoryImpl
import com.learn.navigationdemo.domain.respository.ChatsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindChatsRepositoryImpl(impl: ChatsRepositoryImpl): ChatsRepository


}