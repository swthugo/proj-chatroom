package com.godev.chatroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_member")
public class RoomMember extends AbstractPersistentEntity {

    private Room room;
    @OneToOne
    private Account account;
}
