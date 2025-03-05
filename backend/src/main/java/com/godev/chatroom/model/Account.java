package com.godev.chatroom.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class Account {
  private Long id;

  private String username;

  private String phoneNumber;

  private String salt;

  private String passwordHash;

  private LocalDateTime createAt;

  private LocalDateTime lastSeen;
}
