package com.godev.chatroom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "room")
public class Room extends AbstractPersistentEntity<Room>{
    @Column
    private String name;

    @Column
    private LocalDateTime createAt;
}
