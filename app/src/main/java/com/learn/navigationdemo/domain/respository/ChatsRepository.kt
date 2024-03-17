package com.learn.navigationdemo.domain.respository

import arrow.core.Either
import com.learn.navigationdemo.domain.model.ChatsModel
import com.learn.navigationdemo.domain.model.NetworkError

interface ChatsRepository {
    suspend fun getChats(): Either<NetworkError, List<ChatsModel>>
}