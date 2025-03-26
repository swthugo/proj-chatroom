package com.godev.chatroom.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class Profile extends AbstractAuditableEntity<Profile, Long> {
    @OneToOne
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    @Column
    private String profile_picture;

    @Column
    private String status;
}
