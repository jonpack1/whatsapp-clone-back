package com.jon.whats_clone_back.infrastructure.secondary.message;

import com.jon.whats_clone_back.messaging.domain.user.vo.UserEmail;
import com.jon.whats_clone_back.shared.authentication.application.AuthenticatedUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/api/sse")
public class NotificationResource {

    private final NotificationService notificationService;

    public NotificationResource(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/subscribe")
    public SseEmitter subscribe() {
        return notificationService.addEmitter(
                new UserEmail(AuthenticatedUser.username().username()));
    }
}