package com.jon.whats_clone_back.messaging.domain.user.service;

import com.jon.whats_clone_back.messaging.domain.user.aggregate.User;
import com.jon.whats_clone_back.messaging.domain.user.repository.UserRepository;
import com.jon.whats_clone_back.messaging.domain.user.vo.UserPublicId;

import java.time.Instant;
import java.util.Optional;

public class UserPresence {

    private final UserRepository userRepository;
    private final UserReader userReader;

    public UserPresence(UserRepository userRepository, UserReader userReader) {
        this.userRepository = userRepository;
        this.userReader = userReader;
    }

    public void updatePresence(UserPublicId userPublicId) {
        userRepository.updateLastSeenByPublicId(userPublicId, Instant.now());
    }

    public Optional<Instant> getLastSeenByPublicId(UserPublicId userPublicId) {
        Optional<User> byPublicId = userReader.getByPublicId(userPublicId);
        return byPublicId.map(User::getLastSeen);
    }
}
