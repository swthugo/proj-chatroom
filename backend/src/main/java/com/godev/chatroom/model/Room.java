package com.godev.chatroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "room")
public class Room {
    private Long id;
    private String name;
    private LocalDateTime createAt;
}
