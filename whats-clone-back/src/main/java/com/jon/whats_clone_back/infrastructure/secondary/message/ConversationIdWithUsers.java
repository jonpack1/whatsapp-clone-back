package com.jon.whats_clone_back.infrastructure.secondary.message;

import com.jon.whats_clone_back.messaging.domain.message.vo.ConversationPublicId;
import com.jon.whats_clone_back.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record ConversationIdWithUsers(ConversationPublicId conversationPublicId,
                                      List<UserPublicId> users) {
}