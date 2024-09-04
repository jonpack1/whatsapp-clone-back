package com.jon.whats_clone_back.messaging.domain.message.repository;

import com.jon.whats_clone_back.messaging.domain.message.aggregate.Conversation;
import com.jon.whats_clone_back.messaging.domain.message.aggregate.Message;
import com.jon.whats_clone_back.messaging.domain.message.vo.ConversationPublicId;
import com.jon.whats_clone_back.messaging.domain.message.vo.MessageSendState;
import com.jon.whats_clone_back.messaging.domain.user.aggregate.User;
import com.jon.whats_clone_back.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public interface MessageRepository {

    Message save(Message message, User sender, Conversation conversation);

    int updateMessageSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId, MessageSendState state);

    List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId);

}
