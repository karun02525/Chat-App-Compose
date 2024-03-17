package com.learn.navigationdemo.data.repository

import arrow.core.Either
import com.learn.navigationdemo.data.mapper.toNetworkError
import com.learn.navigationdemo.data.remote.ChatsApi
import com.learn.navigationdemo.domain.model.ChatsModel
import com.learn.navigationdemo.domain.model.Message
import com.learn.navigationdemo.domain.model.MessageDeliveryStatus
import com.learn.navigationdemo.domain.model.MessageType
import com.learn.navigationdemo.domain.model.NetworkError
import com.learn.navigationdemo.domain.respository.ChatsRepository
import javax.inject.Inject

class ChatsRepositoryImpl @Inject constructor(
    private val chatsApi: ChatsApi
) : ChatsRepository {

    override suspend fun getChats(): Either<NetworkError, List<ChatsModel>> {
        return Either.catch {
           // chatList
            chatsApi.getChats()
        }.mapLeft { it.toNetworkError() }
    }
}

val chatList = listOf(
    ChatsModel(
        chatId = 1,
        username = "Priya Singh",
        message = Message(
            content = "Hi Dear h r u?",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://i.pinimg.com/736x/d2/f3/7c/d2f37c23b81f1c2569a5acd5afa60969.jpg",
    ),

    ChatsModel(
        chatId = 2,
        username = "Mohan Shinam",
        message = Message(
            content = "kse do bhia or sa",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 4
        ),
        userImage = "https://assets.vogue.in/photos/63f74fdf6a91b1e97cb89105/2:3/w_2560%2Cc_limit/Janhvi%2520Kapoor.jpg",
    ),

    ChatsModel(
        chatId = 3,
        username = "Monolish Sowenr",
        message = Message(
            content = "Nice to meet you motatma",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 12
        ),
        userImage = "https://www.m9.news/wp-content/uploads/2023/09/Disha-Patani-Sexy-Avatar-1.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 4,
        username = "Rishi Kumar",
        message = Message(
            content = "Ghar app ja raheh hai kesy",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 1
        ),
        userImage = "https://assets.telegraphindia.com/abp/2021/Sep/1632539708_salman-khan.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    ),
    ChatsModel(
        chatId = 5,
        username = "Kishna Kumar",
        message = Message(
            content = "Kese ho derar or sab se...",
            timeStamp = "27/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userImage = "https://searchwallpapers.files.wordpress.com/2014/04/16.jpg",
    )


)