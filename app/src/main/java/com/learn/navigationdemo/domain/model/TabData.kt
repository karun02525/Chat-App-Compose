package com.learn.navigationdemo.domain.model

data class TabData(
    val title: String,
    val unreadCount:Int?

    )

val tabs = listOf(
    TabData(title = Tabs.CHATS.values, unreadCount = null),
    TabData(title = Tabs.STATUS.values,unreadCount = null),
    TabData(title = Tabs.CALLS.values,unreadCount = 4),
)

enum class Tabs(val values: String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}

