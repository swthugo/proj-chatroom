package com.godev.chatroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "message")
public class Message {
    private Long id;
    private Account sender;
    private Account receiver;
    private String content;
    private LocalDateTime timestamp;
    private boolean isRead;
    private Long chatId;
}
