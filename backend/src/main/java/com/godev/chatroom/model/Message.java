package com.godev.chatroom.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "message")
public class Message extends AbstractAuditableEntity<Message, Long> {
    @ManyToOne(optional = false)
    @JoinColumn(name = "sender_id", nullable = false)
    private Account sender;

    @ManyToOne(optional = false)
    @JoinColumn(name = "receiver_id", nullable = false)
    private Account receiver;

    @Column(nullable = false)
    private String content;

    @CreatedDate
    private LocalDateTime createAt;

    @Column
    private boolean isRead;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
}
