package com.jon.whats_clone_back.infrastructure.primary.conversation;

import com.jon.whats_clone_back.messaging.domain.message.aggregate.ConversationToCreate;
import com.jon.whats_clone_back.messaging.domain.message.aggregate.ConversationToCreateBuilder;
import com.jon.whats_clone_back.messaging.domain.message.vo.ConversationName;
import com.jon.whats_clone_back.messaging.domain.user.vo.UserPublicId;
import org.jilt.Builder;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Builder
public record RestConversationToCreate(Set<UUID> members, String name) {

    public static ConversationToCreate toDomain(RestConversationToCreate restConversationToCreate) {
        RestConversationToCreateBuilder restConversationToCreateBuilder = RestConversationToCreateBuilder.restConversationToCreate();

        Set<UserPublicId> userUUIDs = restConversationToCreate.members
                .stream()
                .map(UserPublicId::new)
                .collect(Collectors.toSet());

        return ConversationToCreateBuilder.conversationToCreate()
                .name(new ConversationName(restConversationToCreate.name()))
                .members(userUUIDs)
                .build();
    }
}
