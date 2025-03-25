package com.godev.chatroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "message")
public class Message extends AbstractPersistentEntity {

    private Account sender;

    private Account receiver;

    private String content;

    private LocalDateTime createAt;

    private boolean isRead;

    private Long chatId;
}
