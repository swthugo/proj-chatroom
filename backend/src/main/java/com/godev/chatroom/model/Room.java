package com.godev.chatroom.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Room {
  private Long id;
  private String name;
  private boolean isGroup;
  private LocalDateTime createAt;
  private Long createBy;
}
