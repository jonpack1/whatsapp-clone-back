package com.jon.whats_clone_back.messaging.domain.user.vo;

import  com.jon.whats_clone_back.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
