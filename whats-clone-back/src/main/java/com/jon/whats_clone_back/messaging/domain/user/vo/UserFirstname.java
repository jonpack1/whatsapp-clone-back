package com.jon.whats_clone_back.messaging.domain.user.vo;

import com.jon.whats_clone_back.shared.error.domain.Assert;

public record UserFirstname(String value) {

    public UserFirstname {
        Assert.field(value, value).maxLength(255);
    }
}
