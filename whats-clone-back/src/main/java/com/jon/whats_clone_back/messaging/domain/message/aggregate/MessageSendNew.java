package com.jon.whats_clone_back.messaging.domain.message.aggregate;

import com.jon.whats_clone_back.messaging.domain.message.vo.ConversationPublicId;
import com.jon.whats_clone_back.messaging.domain.message.vo.MessageContent;
import org.jilt.Builder;

@Builder
public record MessageSendNew(MessageContent messageContent,
                             ConversationPublicId conversationPublicId) {
}