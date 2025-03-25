package com.godev.chatroom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class Profile extends AbstractPersistentEntity {
    @OneToOne
    private Account account;

    @Column
    private String profile_picture;

    @Column
    private String status;
}
