package com.jon.whats_clone_back.messaging.domain.message.vo;

public record MessageMediaContent(byte[] file,
                                  String mimetype) {
}
