package com.jon.whats_clone_back.infrastructure.secondary.message;

import com.jon.whats_clone_back.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record MessageIdWithUsers(ConversationViewedForNotification conversationViewedForNotification,
                                 List<UserPublicId> usersToNotify) {
}