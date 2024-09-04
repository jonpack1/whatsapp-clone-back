package com.jon.whats_clone_back.messaging.domain.user.aggregate;

import com.jon.whats_clone_back.messaging.domain.user.vo.AuthorityName;
import com.jon.whats_clone_back.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

    private AuthorityName name;

    public Authority(AuthorityName name) {
        Assert.notNull("name", name);
        this.name = name;
    }

    public AuthorityName getName() {
        return name;
    }
}
