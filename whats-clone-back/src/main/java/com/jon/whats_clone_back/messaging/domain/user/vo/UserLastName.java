package com.jon.whats_clone_back.messaging.domain.user.vo;

import com.jon.whats_clone_back.shared.error.domain.Assert;

public record UserLastName(String value) {

    public UserLastName {
        Assert.field(value, value).maxLength(255);
    }
}
