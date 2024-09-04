package com.jon.whats_clone_back.infrastructure.primary.user;

import com.jon.whats_clone_back.messaging.domain.user.aggregate.Authority;
import org.jilt.Builder;

import java.util.Set;
import java.util.stream.Collectors;

@Builder
public record RestAuthority(String name) {

    public static Set<RestAuthority> fromSet(Set<Authority> authorities) {
        return authorities.stream()
                .map(authority -> RestAuthorityBuilder.restAuthority().name(authority.getName().name()).build())
                .collect(Collectors.toSet());
    }

}