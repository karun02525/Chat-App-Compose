package com.learn.navigationdemo.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learn.navigationdemo.domain.respository.ChatsRepository
import com.learn.navigationdemo.ui.components.ChatsViewState
import com.learn.navigationdemo.util.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChatsViewModel @Inject constructor(
    private val chatsRepository: ChatsRepository
) : ViewModel() {

    private val _state = MutableStateFlow(ChatsViewState())
    val state = _state.asStateFlow()

    init {
        getChatList()
    }

    private fun getChatList() {
        viewModelScope.launch {
            _state.update { it.copy(loading = true) }
            chatsRepository.getChats()
                .onRight { chats ->
                    sendEvent(Event.Toast("Successfully loaded"))
                    _state.update {
                        it.copy(
                            chats = chats
                        )
                    }
                }
                .onLeft { error ->
                    sendEvent(Event.Toast(error.error.message))
                }
            _state.update { it.copy(loading = false) }
        }
    }
}