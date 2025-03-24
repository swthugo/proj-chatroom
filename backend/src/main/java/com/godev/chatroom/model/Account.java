package com.godev.chatroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "account")
public class Account {
    @Id
    private Long id;
    private String username;
    private String phone;
    private String salt;
    private String passwordHash;
    private LocalDateTime createAt;
    private LocalDateTime lastSeen;
}
