package com.jon.whats_clone_back.messaging.domain.message.service;

import com.jon.whats_clone_back.infrastructure.secondary.message.ConversationViewedForNotification;
import com.jon.whats_clone_back.messaging.domain.message.aggregate.Message;
import com.jon.whats_clone_back.messaging.domain.message.vo.ConversationPublicId;
import com.jon.whats_clone_back.messaging.domain.user.vo.UserPublicId;
import com.jon.whats_clone_back.shared.service.State;

import java.util.List;

public interface MessageChangeNotifier {

    State<Void, String> send(Message message, List<UserPublicId> userToNotify);

    State<Void, String> delete(ConversationPublicId conversationPublicId, List<UserPublicId> userToNotify);

    State<Void, String> view(ConversationViewedForNotification conversationViewedForNotification, List<UserPublicId> usersToNotify);
}
