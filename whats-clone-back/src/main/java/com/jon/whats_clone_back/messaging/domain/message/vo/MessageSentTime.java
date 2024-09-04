package com.jon.whats_clone_back.messaging.domain.message.vo;

import com.jon.whats_clone_back.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
