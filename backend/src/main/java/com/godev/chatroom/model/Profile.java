package com.godev.chatroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "profile")
public class Profile {
    private Long id;
    private Account accountId;
    private String profile_picture;
    private String status;
}
