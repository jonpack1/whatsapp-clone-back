package com.jon.whats_clone_back.messaging.domain.message.aggregate;

import com.jon.whats_clone_back.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Messages> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
