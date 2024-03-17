package com.learn.navigationdemo.domain.model

data class ChatsModel(
    val chatId:Int,
    val username:String,
    val message:Message,
    val userImage:String
)

data class Message(
    val content:String,
    val deliveryStatus:MessageDeliveryStatus,
    val type: MessageType,
    val timeStamp:String,
    val unreadCount:Int?
)

enum class MessageDeliveryStatus(val message:String){
    DELIVERED("delivered"),
    READ("read"),
    PENDING("pending"),
    ERROR("error")
}

enum class MessageType(val type:String){
    TEXT("text"),
    AUDIO("audio")
}