package com.godev.chatroom.model;

import com.godev.chatroom.enums.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountRoom {
  private Long id;
  private Account account;
  private Room room;
  private Role role;
}
