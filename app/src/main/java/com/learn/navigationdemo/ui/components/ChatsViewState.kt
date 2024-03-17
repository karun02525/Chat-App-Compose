package com.learn.navigationdemo.ui.components

import com.learn.navigationdemo.domain.model.ChatsModel

data class ChatsViewState(
    var loading:Boolean=false,
    val chats:List<ChatsModel> = emptyList(),
    var errorL:String?=null
)